package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext painter = canvas.getGraphicsContext2D();
        painter.setFill(Color.BLACK);
        painter.fillRect(100, 50, 50, 50);
        painter.fillRect(250, 50, 50, 50);
        painter.fillRect(50, 200, 50, 50);
        painter.fillRect(100, 250, 50, 50);
        painter.fillRect(150, 250, 50, 50);
        painter.fillRect(200, 250, 50, 50);
        painter.fillRect(250, 250, 50, 50);
        painter.fillRect(300, 200, 50, 50);

        BorderPane pane = new BorderPane();
        pane.setCenter(canvas);
        Scene view = new Scene(pane);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
