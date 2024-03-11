package org.example.tipcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class TipCalculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TipCalculator.class.getResource("tipCalculatorLayout.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        Image tipIcon = new Image(getClass().getResourceAsStream("/tipsImage.png"));
        stage.getIcons().add(tipIcon);

        stage.setTitle("Tip Calculator by Henok");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();

    }
}