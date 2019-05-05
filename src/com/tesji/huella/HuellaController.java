package com.tesji.huella;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class HuellaController {

    @FXML
    private ImageView imgHuella;

    @FXML
    private JFXButton btnRegistro;

    @FXML
    private JFXTextArea txtimpreciondedatos;

    @FXML
    void btnRegistroOnAction(ActionEvent event) {
    	  try {
  FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/tesji/registro/Registro.fxml"));
             AnchorPane root1= loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1,400,400));
	   stage.setTitle("Registro de Huella");
            stage.show();
          } catch (IOException ex) {
          }
    }

}
