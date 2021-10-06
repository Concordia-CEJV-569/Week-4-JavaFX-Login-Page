package com.concordia.loginpage.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DetailsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label welcomeLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label ageLabel;

    @FXML
    private Label professionLabel;

    @FXML
    private Label twitterLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label websiteLabel;

    @FXML
    void initialize() {
    }

    public void setLabels(String name, String profession, int age) {
        this.welcomeLabel.setText("Welcome " + name);
        this.nameLabel.setText("Name: " + name);
        this.professionLabel.setText("Profession: " + profession);
        this.ageLabel.setText("Age: " + age);
    }
}
