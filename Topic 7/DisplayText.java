/**
 *@author Miguel Torres
 * CST 105 This is my own work
 */
package Exercise7;

import javafx.application.Application;

import javafx.stage.Stage;

import javafx.scene.text.Text;

import javafx.scene.text.Font;

import javafx.scene.text.FontWeight;

import javafx.scene.text.FontPosture;

import javafx.scene.Scene;

import javafx.scene.layout.HBox;

import javafx.scene.paint.Color;

import javafx.geometry.Insets;

public class DisplayText extends Application {

    public static void main(String[] args) {

        Application.launch(args);

    }

    @Override

    public void start(Stage primaryStage) {

        //set the HBox for the scene
        HBox hBox = new HBox(10);

        hBox.setPadding(new Insets(15));

        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);

        //Store 5 text objects to hBox with random colors and transparencies.
        for (int i = 0; i < 5; i++) {

            Text text = new Text("Java.");

            text.setRotate(90);

            text.setFont(font);

            text.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));

            hBox.getChildren().add(text);

        }

        //display the scene
        Scene scene = new Scene(hBox);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

}
