package about;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AboutController {


    public void ok(ActionEvent e) throws IOException {
        final Node node = (Node) e.getSource();
        final Scene sourceScene = node.getScene();
        final Stage stage = (Stage) sourceScene.getWindow();

        final Parent root = FXMLLoader.load(getClass().getResource("/circle/circle.fxml"));
        final Scene destinationScene = new Scene(root);
        final String styleSheet = getClass().getResource("/main/style.css").toExternalForm();
        destinationScene.getStylesheets().add(styleSheet);
        stage.setScene(destinationScene);
        stage.show();
    }
}
