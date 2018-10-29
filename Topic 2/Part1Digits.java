/**
 *@author Miguel Torres
 * CST 105 Week 2 Assignment Part 1
 */
package part1.digits;

import java.util.Scanner;

public class Part1Digits {

    public static void main(String[] args) {

        //Create Scanner for input
        Scanner input = new Scanner(System.in);

        //Prompts the user for input
        System.out.print("Enter a 5-digit positive number: ");

        //Store input variable into int number
        int Mainnumber = input.nextInt();

        //Variables that store each digit of the number
        int digitOne = Mainnumber % 100000 / 10000;

        int digitTwo = Mainnumber % 10000 / 1000;

        int digitThree = Mainnumber % 1000 / 100;

        int digitFour = Mainnumber % 100 / 10;

        int digitFive = Mainnumber % 10;

       
        int sum = digitOne + digitTwo + digitThree + digitFour + digitFive;

        //Output the answer
        System.out.println("The sum of the digits is " + digitOne + " + "
                + digitTwo + " + " + digitThree + " + " + digitFour + " + "
                + digitFive + " = " + sum);
    }

}
