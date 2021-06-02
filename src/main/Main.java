package main;

import circle.CircleController;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        //final Parent root = FXMLLoader.load(getClass().getResource("/circle/circle.fxml"));

        final FXMLLoader loader = new FXMLLoader(getClass().getResource("/circle/circle.fxml"));
        final Parent root = loader.load();

        final CircleController circleController = loader.getController();
        // TODO: Pass data to the controller

        final Scene scene = new Scene(root);

        final String styleSheet = getClass().getResource("/main/style.css").toExternalForm();
        scene.getStylesheets().add(styleSheet);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ButtonsFX");
        primaryStage.setResizable(false);


        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                windowEvent.consume();

                final Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Are you sure you want to exit?");
                alert.setHeaderText("You're about to exit.");
                alert.setContentText("Are you sure?");

                if (alert.showAndWait().get() == ButtonType.OK) {
                    primaryStage.close();
                }
            }
        });


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}




