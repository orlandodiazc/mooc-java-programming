package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public void start(Stage window) {
        Label fieldLabel = new Label("Enter your name and start.");
        TextField field = new TextField();
        Button fieldBtn = new Button("Start");

        GridPane layout = new GridPane();

        layout.add(fieldLabel, 0, 0);
        layout.add(field, 0, 1);
        layout.add(fieldBtn, 0, 2);

        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);

        Scene firstView = new Scene(layout);

        Label welcomeText = new Label();

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene secondView = new Scene(welcomeLayout);

        fieldBtn.setOnAction((event) -> {
            welcomeText.setText("Welcome " + field.getText() + "!");
            window.setScene(secondView);
        });

        window.setScene(firstView);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
