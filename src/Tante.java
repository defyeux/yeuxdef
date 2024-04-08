import java.util.Scanner;

public class Tante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose number 1-10");
        int ch = scan.nextInt();
        int n;
        int[] lst;
        switch (ch) {
            case 1:
                System.out.print("Input n: ");
                n = scan.nextInt();
                System.out.print("Input an array of n elements: ");
                lst = new int[n];

                for (int i = 0; i < n; i++) {
                    lst[i] = scan.nextInt();
                }

                System.out.printf("The minimum of them: %d\n", first(n, lst));

            case 2:
                System.out.print("Input n: ");
                n = scan.nextInt();
                System.out.print("Input an array of n elements: ");
                lst = new int[n];

                for (int i = 0; i < n; i++) {
                    lst[i] = scan.nextInt();
                }

                System.out.println("The average of given array: " + second(n, lst));
            case 3:
                System.out.print("Input integer number: ");
                n = scan.nextInt();
                System.out.printf("%d is %s\n", n, third(n));
            case 4:
                System.out.print("Input integer number: ");
                n = scan.nextInt();
                System.out.printf("Factorial of %d - %d", n, fourth(n));
        }
    }

    private static int first(int n, int[] lst) {
        int min = lst[0];

        for (int i = 1; i < n; i++) {
            if (lst[i] < min) {
                min = lst[i];
            }
        }

        return min;
    }

    /**
     * This method calculates the minimun of a given array of a given length
     * It uses iteration approach
     * Time complexity: O(n), where n is the length of the array
     * The iterative algorithm iterates through all numbers from 1 to n - 1
     * resulting in linear time complexity
     * @param n is a length of array, @param lst is an array, whose minimun element is to be found
     * @return number is a minimun of given array
     */

    private static double second(int n, int[] lst) {
        int sum = 0;

        for (int x: lst) {
            sum += x;
        }


        return (double) sum / n;
    }
    /**
     * This method calculates the average of a given array
     * It uses iteration approach
     * Time complexity: O(n), where n is the length of the array
     * The iterative algorithm iterates through all numbers for 0 to n - 1
     * resulting in linear time complexity
     * @param n is a length of array, @param lst is an array, whose average is to be found
     * @return average of a given array
     */


    private static String third(int n) {
        for (int x = 2; x <= n / 2; x++) {
            if (n % x == 0) {
                return "Composite";
            }
        }

        return "Prime";
    }

    /**
     * This method determine if given number is prime or composite
     * It uses iteration approach
     * Time complexity: O(n), where n is the length of the array
     * The iterative algorithm iterates through all numbers for 2 to n - 2
     * resulting in linear time complexity
     * @param n is a number that is checked on prime number
     * @return this number is prime or composite
     */

    private static int fourth(int n) {
        if (n == 0 || n == 1) return 1;

        return n * fourth(n - 1);
    }

    /**
     * This method calculate factorial of a given number
     * It uses recursive approach
     * Time complexity: O(n), where n is the length of the array
     * The recursive algorithm iterates through all numbers from n to 1
     * resulting in linear time complexity
     * @param n is a number that is to be found
     * @return the factorial of given number
     */
}
