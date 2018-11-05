/*
*@author MiguelVR
*CST 105- Week 3
*/



package PigLatin;

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) throws Exception {

        java.io.File file = new java.io.File("samplerun.txt");

        final String VOWEL = "YAY";

        final String OTHER = "AY";

        Scanner input = new Scanner(file);

        String pigLatin = "", latter = "";

        while (input.hasNext()) {

            String untranslated = input.next();

            char firstLetter = Character.toUpperCase(untranslated.charAt(0));

            if (untranslated.length() == 1
                    || firstLetter == 'A' || firstLetter == 'U'
                    || firstLetter == 'I' || firstLetter == 'O'
                    || firstLetter == 'U') {

                latter = untranslated.toUpperCase();

                pigLatin = latter.concat(VOWEL);

            } else if ((Character.toUpperCase(untranslated.charAt(1)) == 72
                    && (firstLetter == 67 || firstLetter == 80 || firstLetter == 84))
                    || (Character.toUpperCase(untranslated.charAt(1)) == 84 && firstLetter == 83)
                    || (firstLetter == 81
                    && Character.toUpperCase(untranslated.charAt(1)) == 85)) {

                char secondLetter = Character.toUpperCase(untranslated.charAt(1));

                latter = untranslated.substring(2);

                latter = latter.toUpperCase();

                pigLatin = latter + firstLetter + secondLetter + OTHER;

            } else if ((firstLetter >= 66 && firstLetter <= 68)
                    || (firstLetter >= 70 && firstLetter <= 72)
                    || (firstLetter >= 74 && firstLetter <= 78)
                    || (firstLetter >= 80 && firstLetter <= 84)
                    || (firstLetter >= 86 && firstLetter <= 89)) {

                latter = untranslated.substring(1);

                latter = latter.toUpperCase();

                pigLatin = latter + firstLetter + OTHER;

            }

            System.out.printf("%-10s%-10s\n", untranslated, pigLatin);

        }

        input.close();

    }

}
