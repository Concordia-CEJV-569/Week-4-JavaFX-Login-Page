module com.concordia.loginpage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.concordia.loginpage to javafx.fxml;
    exports com.concordia.loginpage;
    exports com.concordia.loginpage.controller;
    opens com.concordia.loginpage.controller to javafx.fxml;
}