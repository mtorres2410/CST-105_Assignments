/**
 *@author MiguelVR
 * CST 105 Week 2 Assignment Part 2
 */
package part.pkg2.temp.converter;

import java.util.Scanner;

public class Part2TempConverter {

    public static void main(String[] args) {

        //Declare the variables
        double fahrenheit, celsius, newF, newC;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Fahrenheit temperature");
        fahrenheit = input.nextDouble();
        //Math for converting fahrenheit to celsius
        newC = (fahrenheit - 32) * 5 / 9;
        System.out.println("The conversion from " + fahrenheit + " F " + "to Celsius is: " + newC);

        System.out.println("Enter a Celsius temperature");
        celsius = input.nextDouble();
        //Math for converting celsius to fahrenheit
        newF = celsius * 9 / 5 + 32;
        System.out.println("The conversion from " + celsius + " C " + "to Fahrenheit is: " + newF);

    }

}
