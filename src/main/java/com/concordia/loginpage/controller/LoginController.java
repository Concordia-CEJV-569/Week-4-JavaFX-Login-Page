package com.concordia.loginpage.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    void initialize() {
        usernameTextField.setStyle("-fx-background-color: #62727b; -fx-text-fill: #ffffff");
        passwordField.setStyle("-fx-background-color: #62727b; -fx-text-fill: #ffffff");

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Login");
                loginUser();
            }
        });
    }

    private void loginUser() {
        // Get the main window
        loginButton.getScene().getWindow().hide();

        if (!usernameTextField.getText().trim().equals("") && !passwordField.getText().trim().equals("")) {
            // login
            Stage detailsStage = new Stage();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/com/concordia/loginpage/details.fxml"));
                Scene scene = new Scene(root);
                detailsStage.setScene(scene);
                detailsStage.show();
                detailsStage.setResizable(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
