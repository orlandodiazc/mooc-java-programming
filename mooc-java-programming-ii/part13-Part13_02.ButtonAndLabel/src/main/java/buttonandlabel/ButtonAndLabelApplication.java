package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    public void start(Stage window) {
        Button button = new Button("Open Modal");
        Label label = new Label("random info");

        FlowPane group = new FlowPane();
        group.getChildren().add(label);
        group.getChildren().add(button);
        Scene view = new Scene(group);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
