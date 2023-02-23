package com.example.mediaplayer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;


public class Controller {

MediaPlayer player;
    @FXML
    void openMediaMenu(ActionEvent event) {
        System.out.println("Open media clicked");
    }


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}