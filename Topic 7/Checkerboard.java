/**
 *@author Miguel Torres
 * CST 105 This is my own work
 */
package Exercise7;

import javafx.stage.Stage;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;

public class Checkerboard extends Application {

    public static void main(String[] args) {

        Application.launch(args);

    }

    @Override

    public void start(Stage primaryStage) {

        final double WIDTH = 200;

        final double HEIGHT = 200;

        Pane pane = new Pane();

        for (int x = 0; x < 8; x++) {

            //boolean value to determine if the first rectangle in the row is black or white
            boolean isWhite = x % 2 == 0;

            for (int y = 0; y < 8; y++) {

                //all recatngles set to the same width and height withing the width and height
                //of the window.
                Rectangle rectangle = new Rectangle(x * WIDTH / 8,
                        y * HEIGHT / 8, WIDTH / 8, HEIGHT / 8);

                rectangle.setStroke(Color.BLACK);

                if (isWhite) {

                    rectangle.setFill(Color.WHITE);

                } else {

                    rectangle.setFill(Color.BLACK);

                }

                //toggle isWhite to set the next square to black/white
                isWhite = !isWhite;

                pane.getChildren().add(rectangle);

            }

        }

        Scene scene = new Scene(pane, WIDTH, HEIGHT);

        primaryStage.setTitle("Checkerboard");

        primaryStage.setScene(scene);

        primaryStage.setResizable(false);

        primaryStage.show();

    }

}
