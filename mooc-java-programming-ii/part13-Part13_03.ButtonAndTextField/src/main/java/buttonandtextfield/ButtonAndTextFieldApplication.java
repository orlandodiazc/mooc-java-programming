package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public void start(Stage window) {
        FlowPane group = new FlowPane();
        group.getChildren().add(new Button("Send"));
        group.getChildren().add(new TextField());

        Scene view = new Scene(group);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
