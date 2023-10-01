module com.example.seleniumwebdriverdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seleniumwebdriverdemo to javafx.fxml;
    exports com.example.seleniumwebdriverdemo;
}