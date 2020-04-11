module com.henriquesbraga {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fazecast.jSerialComm;
    requires javafx.graphics;
    requires com.jfoenix;



    exports com.henriquesbraga.application;
    opens com.henriquesbraga.controllers to javafx.fxml;
}