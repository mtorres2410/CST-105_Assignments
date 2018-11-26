
/**
 *@author MiguelVR
 * CST 105 This is my own work.
 */
public class Exercise7 {

    public static void main(String[] args) {

        for (int count = 1; count <= 100000; count++) {

            if (isPrime(count) && isPalindrome(count)) {
                System.out.print(count + " ");
            }

        }

    }

    //returns true is int number is a palindrome
    public static boolean isPalindrome(int number) {

        //convert the integer to a string object
        String numberString = Integer.toString(number);

        //reverse it
        String numberStringReverse = reverse(numberString);

        //compare to determine if it is a palindrome
        return numberString.equals(numberStringReverse);

    }

    //returns true if int number is prime
    public static boolean isPrime(int number) {

        //determines if the number is divisible by anything other than 1 and itself
        for (int divisor = 2; divisor <= number / 2; divisor++) {

            if (number % divisor == 0) {

                return false;

            }

        }

        return true;

    }

    //returns the revers of a String object
    public static String reverse(String s) {

        StringBuilder stringBuilder = new StringBuilder(s);

        stringBuilder.reverse();

        return stringBuilder.toString();

    }
}
