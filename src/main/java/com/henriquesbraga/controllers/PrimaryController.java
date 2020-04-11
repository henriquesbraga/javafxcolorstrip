package com.henriquesbraga.controllers;

import com.fazecast.jSerialComm.SerialPort;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * com.henriquesbraga javafx application.
 */
public class PrimaryController implements Initializable {

    @FXML
    ColorPicker colorPicker;

    @FXML
    ComboBox cbPortas;
    @FXML
    JFXButton btnConectar;
    @FXML
    JFXButton btnSend;
    private SerialPort porta;

//----------------------Metodos da janela-------------------------------\\

    private void carregarPortas(){
        SerialPort[] portNames = SerialPort.getCommPorts();
        for(SerialPort portName : portNames){
            cbPortas.getItems().add(portName.getSystemPortName());
            System.out.println("OK");
        }
        System.out.println("Portas Carregadas");
    }

    @FXML
    private void conectar(ActionEvent event){
        try {
            if (btnConectar.getText().equals("Connect")) {
                porta = SerialPort.getCommPort(cbPortas.getSelectionModel().getSelectedItem().toString());
                if (porta.openPort()) {
                    btnConectar.setText("Disconnect");
                    cbPortas.setDisable(true);
                }
            } else {
                porta.closePort();
                cbPortas.setDisable(false);
                btnSend.setDisable(true);
            }
        }
        catch (NullPointerException ne){
            Alert a1 = new Alert(Alert.AlertType.ERROR,"Select a port", ButtonType.OK);
            a1.setHeaderText(null);
            a1.show();
        }
    }

//-------------------Metodos do outpur------------------------------\\

    @FXML
    private void sendColor(){
        String color = colorPicker.getValue().toString();
        PrintWriter output = new PrintWriter(porta.getOutputStream());
        output.print(color.replace("0x","#").substring(0, color.length() - 3));
        output.flush();
    }

//----------------------Initialize----------------------------------\\
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        carregarPortas();
    }
}
