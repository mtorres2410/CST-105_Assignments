/**
 *@author MiguelVR
 * CST-105 Week 3 Assignment
 */
package Week3Assignment;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = (int) (1 + Math.random() * 10001), numberOfGuesses = 1, guess = 0,
                guessLowest = 1, guessHighest = 10000;

        System.out.print("Guess a number between 1 and 10,000: ");

        guess = input.nextInt();

        
        while (guess != number) {
        if (guess > number) {

        System.out.println("GO LOWER\n");

               
        guessHighest = Math.min(guessHighest, (guess - 1));

        System.out.print("Enter a number between " + guessLowest + " and " 
        + guessHighest + ": ");
        
        guess = input.nextInt();

        numberOfGuesses += 1;
        } 
        else if (guess < number) {

        System.out.println("GO HIGHER\n");

        guessLowest = Math.max(guessLowest, (guess + 1));

        System.out.print("Enter a number between " + guessLowest + " and " 
        + guessHighest + ": ");

        guess = input.nextInt();

        numberOfGuesses += 1;

            }

        }

        System.out.println("\nYou Win! It took you " + numberOfGuesses + " tries to guess the number.");

    }

}
