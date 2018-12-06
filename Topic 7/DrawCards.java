/**
 *@author Miguel Torres
 * CST 105 This is my own work
 */
package Exercise7;

import java.util.ArrayList;

import java.util.Collections;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.HBox;

import javafx.scene.layout.Pane;

import javafx.stage.Stage;

import javafx.geometry.Insets;

import javafx.scene.image.Image;

import javafx.scene.image.ImageView;

public class DrawCards extends Application {

    public static void main(String[] args) {

        Application.launch();

    }

    @Override

    public void start(Stage primaryStage) {

        final int DECK_SIZE = 52;

        ArrayList<Integer> deckList = new ArrayList<>();

        for (int i = 0; i < DECK_SIZE; i++) {

            deckList.add(i);

        }

        Collections.shuffle(deckList);

        deckList.get(0);

        Pane pane = new HBox(10);

        pane.setPadding(new Insets(5));

        for (int i = 0; i < 3; i++) {

            Image card = new Image("Image\\" + deckList.get(i) + ".png");

            pane.getChildren().add(new ImageView(card));

        }

        primaryStage.setTitle("Three Random Cards");

        primaryStage.setScene(new Scene(pane));

        primaryStage.show();

    }

}
