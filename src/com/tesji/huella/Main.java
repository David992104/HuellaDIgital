package com.tesji.huella;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Ventana1.fxml"));
			Scene scene = new Scene(root,400,400);
			
			/*AnchorPane root1 = (AnchorPane)FXMLLoader.load(getClass().getResource("Ventana1.fxml"));
			Scene scene1 = new Scene(root,305,400);*/
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Huella 341");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
