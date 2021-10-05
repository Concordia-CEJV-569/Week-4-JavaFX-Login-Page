module com.concordia.loginpage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.concordia.loginpage to javafx.fxml;
    exports com.concordia.loginpage;
}