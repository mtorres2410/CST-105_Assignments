/*@author MiguelVR
 * CST-105
 * Week 4 Exercise 5
 * 
 */

import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) throws Exception {

        final int ROWS = 45;

        final int COLUMNS = 20;

        java.io.File file = new java.io.File("FourScoreSpeech.txt");

        char[][] words = new char[ROWS][COLUMNS];

        Scanner fileInput = new Scanner(file);

        String oldString = fileInput.nextLine();

        oldString = fixLength(oldString, (ROWS * COLUMNS));

        int place = 0;

        for (int column = 0; column < COLUMNS; column++) {

            for (int row = 0; row < ROWS; row++) {

                words[row][column] = oldString.charAt(place);

                place++;

            }

        }

        String newString = "";

        for (int row = 0; row < ROWS; row++) {

            for (int column = 0; column < COLUMNS; column++) {

                newString += words[row][column];

            }

        }

        System.out.println(newString);

        fileInput.close();

    }

    public static String fixLength(String in, int correctLength) {

        String temp = "";

        if (in.length() > correctLength) {

            temp = in.substring(0, correctLength);

            in = temp;

            return in;

        } else {

            while (in.length() < correctLength) {

                in = in.concat("@");

            }

            return in;

        }

    }

}
