package com.tesji.registro;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class RegistroController {

    @FXML
    private JFXTextField txtapellido1;

    @FXML
    private JFXTextField txtapellido2;

    @FXML
    private JFXTextField txtmatricula;

    @FXML
    private JFXTextField txtnombre;

    @FXML
    private ImageView imagen;

    @FXML
    private JFXButton btnguardar;

    @FXML
    private JFXButton btnsalir;

    @FXML
    void btnguardarOnAction(ActionEvent event) {

    	
    	System.exit(0);
    }

    @FXML
    void btnsalirOnAction(ActionEvent event) {

    }

}
