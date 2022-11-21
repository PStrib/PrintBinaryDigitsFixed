import java.util.Scanner;

public class PrintBinaryDigitsFixed {
    public static void main (String[] args) {
        final int MIN = 0;
        final int MAX = (int) (Math.pow(2, 30) - 1);
        int[] digits = new int[30];    // array to hold the digits
        int number = readInput ("Enter an integer from " + MIN + " to " + MAX, MIN, MAX);

        // Your code goes here. This code must do the following:
        // Declare a "companion" variable to count how many digits stored
        // Initialize that variable appropriately
        // While number > 0
        //    Store the remainder (number % 2) in the array
        //    Update the companion variable
        //    Set number to be number / 2
        // Display the filled portion of the array in reverse order     }
    }

    /**
     * Print the contents of an array backwards, starting from index last
     * @param array: an array of integers
     * @param last: the index of the starting location
     */
    public static void printBackwardsFrom (int[] array, int last)
    {
        // Your code goes here
        // This code is very similar, but not quite identical to the
        // printBackwards() method from Part 1 of this practical sheet.
        // Print all the digits on the same line with no spaces
        // between them.
    }

    /**
     * Read in an integer between two given bounds
     * @param prompt: the prompt to show the user
     * @param min: the smallest acceptable input value
     * @param max: the largest acceptable input value
     */
    public static int readInput(String prompt, int min, int max)
    {
        // Your code goes here.
        // This method is very similar, but not identical to the
        // readPositiveInteger() method in the InteractiveRectangle project
        // in Part Two of Programming Practical 9.
    }

    /**
     * Read in a positive integer and return its value
     * @param prompt to be shown to the user
     */
    public static int readInteger(String prompt)     {
        int integer=0;
        System.out.println(prompt);

        Scanner scan=new Scanner(System.in);

        while(!scan.hasNextInt()) {
            scan.next();
            System.out.println(prompt);
        }
        integer=scan.nextInt();
        return integer;
    }
}
