package sample;

import Models.CaseEchiquier;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(Main.class.getResource("/View/echiquier.fxml"));

            Scene scene = new Scene(fxmlLoader.load());

            primaryStage.setTitle("Mon jeu d'échec");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {

        launch(args);
    }
}
