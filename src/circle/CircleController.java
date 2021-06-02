package circle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class CircleController {

    @FXML
    private Circle circle;

    private double x = 0.0;
    private double y = 0.0;

    public void up(ActionEvent e) {
        circle.setCenterY(y -= 10);
        System.out.println("UP");
    }

    public void down(ActionEvent e) {
        circle.setCenterY(y += 10);
        System.out.println("DOWN");
    }

    public void left(ActionEvent e) {
        circle.setCenterX(x -= 10);
        System.out.println("LEFT");
    }

    public void right(ActionEvent e) {
        circle.setCenterX(x += 10);
        System.out.println("RIGHT");
    }

    public void about(ActionEvent e) throws IOException {
        final Node node = (Node) e.getSource();
        final Scene sourceScene = node.getScene();
        final Stage stage = (Stage) sourceScene.getWindow();

        final Parent root = FXMLLoader.load(getClass().getResource("/about/about.fxml"));
        final Scene destinationScene = new Scene(root);
        final String styleSheet = getClass().getResource("/main/style.css").toExternalForm();
        destinationScene.getStylesheets().add(styleSheet);
        stage.setScene(destinationScene);
        stage.show();
    }
}
