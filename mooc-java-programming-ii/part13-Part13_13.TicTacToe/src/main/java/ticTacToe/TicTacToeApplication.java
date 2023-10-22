package ticTacToe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage window) {
        Board board = new Board();

        BorderPane layout = new BorderPane();
        Label gameInfo = new Label("Turn: " + board.getTurn());

        EventHandler<ActionEvent> handleClick = (ActionEvent event) -> {
            if (!board.getIsOver()) {
                Button source = (Button) event.getSource();
                Players turn = board.getTurn();
                if (board.setPlay(source.getId(), turn) == null) {
                    source.setText(turn.name());
                    if (board.isWinner(Players.X) || board.isWinner(Players.O) || board.getSize() >= 9) {
                        board.setIsOver(true);
                        gameInfo.setText("The end!");
                    } else {
                        gameInfo.setText("Turn: " + board.toggleTurn());
                    }
                }
            }

        };

        GridPane gameGrid = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button btn = new Button();
                btn.setId((i * 3 + j) + "");
                btn.setMinSize(40, 40);
                btn.setOnAction(handleClick);
                gameGrid.add(btn, j, i);
            }
        }
        gameGrid.setVgap(3);
        gameGrid.setHgap(3);

        layout.setTop(gameInfo);
        layout.setCenter(gameGrid);

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
