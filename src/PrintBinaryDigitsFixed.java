import java.util.Scanner;

public class PrintBinaryDigitsFixed {
    public static void main (String[] args) {
        final int MIN = 0;
        final int MAX = (int) (Math.pow(2, 30) - 1);
        int[] digits = new int[30];    // array to hold the digits
        int number = readInput ("Enter an integer from " + MIN + " to " + MAX, MIN, MAX);

        int i=0;
        while (number>0){
            digits[i]=number%2;
            i++;
            number/=2;
        }
        printBackwardsFrom(digits, i);
    }

    /**
     * Print the contents of an array backwards, starting from index last
     * @param array: an array of integers
     * @param last: the index of the starting location
     */
    public static void printBackwardsFrom (int[] array, int last)
    {
        int i=last;
        while (i>0){
            System.out.print(array[i-1]);
            i--;
        }
    }

    /**
     * Read in an integer between two given bounds
     * @param prompt: the prompt to show the user
     * @param min: the smallest acceptable input value
     * @param max: the largest acceptable input value
     */
    public static int readInput(String prompt, int min, int max)
    {
        int integer=readInteger(prompt);
        while (integer<=min || integer>=max){
            System.out.println("sorry, please enter an integer between "+min+" and "+max);
            readInteger(prompt);
        }
        return integer;
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
