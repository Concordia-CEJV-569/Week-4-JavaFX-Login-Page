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
                loginUser();
            }
        });
    }

    private void loginUser() {
        loginButton.getScene().getWindow().hide();

        String username = usernameTextField.getText().trim();
        String password = passwordField.getText().trim();

        if (!username.equals("") && !password.equals("")) {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/com/concordia/loginpage/details.fxml"));

            try {
                fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = fxmlLoader.getRoot();
            Stage detailsStage = new Stage();

            Scene scene = new Scene(root);
            detailsStage.setScene(scene);

            DetailsController detailsController = fxmlLoader.getController();
            detailsController.setLabels(username, "JavaFX Developer", 25);

            detailsStage.show();
            detailsStage.setResizable(false);
        }
    }
}
