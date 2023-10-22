package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        Button firstBtn = new Button("To the second view!");
        BorderPane groupFirst = new BorderPane();
        groupFirst.setTop(new Label("First view!"));
        groupFirst.setCenter(firstBtn);
        Scene first = new Scene(groupFirst);

        Button secondBtn = new Button("To the third view!");
        VBox groupSecond = new VBox();
        groupSecond.getChildren().addAll(secondBtn, new Label("Second view!"));
        Scene second = new Scene(groupSecond);

        Button thirdBtn = new Button("To the first view!");
        GridPane groupThird = new GridPane();
        groupThird.add(new Label("Third view!"), 0, 0);
        groupThird.add(thirdBtn, 1, 1);
        Scene third = new Scene(groupThird);

        firstBtn.setOnAction((event) -> {
            window.setScene(second);
        });

        secondBtn.setOnAction((event) -> {
            window.setScene(third);
        });

        thirdBtn.setOnAction((event) -> {
            window.setScene(first);
        });
        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
