package com.henriquesbraga.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("/primary.fxml"));
            Scene scene= new Scene(parent);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Arduino Color");
            stage.setResizable(false);
            Image icon = new Image("/semiconductor.png");
            stage.getIcons().add(icon);
        }
        catch(IOException e) {e.printStackTrace();}
    }

    public static void main(String[] args) {
        launch();
    }

}