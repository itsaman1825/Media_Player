package com.example.mediaplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //load sample.fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sample.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 800); //scene gets all the basic functionalities of the fxml file we
        // have loaded.
        stage.setTitle("Media Player");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}