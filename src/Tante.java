import java.util.Scanner;

public class Tante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose number 1-10");
        int ch = scan.nextInt();
        int n, a, k;
        String s;
        int[] lst;
        switch (ch) {
            case 1:
                System.out.print("Input n: ");
                n = scan.nextInt();
                System.out.printf("Input an array of %d elements: ", n);
                lst = new int[n];

                for (int i = 0; i < n; i++) { lst[i] = scan.nextInt(); }

                System.out.printf("The minimum of them: %d\n", first(n, lst));

            case 2:
                System.out.print("Input n: ");
                n = scan.nextInt();
                System.out.printf("Input an array of %d elements: ", n);
                lst = new int[n];

                for (int i = 0; i < n; i++) { lst[i] = scan.nextInt(); }

                System.out.println("The average of given array: " + second(n, lst));
            case 3:
                System.out.print("Input integer number: ");
                n = scan.nextInt();
                System.out.printf("%d is %s\n", n, third(n));
            case 4:
                System.out.print("Input integer number: ");
                n = scan.nextInt();
                System.out.printf("Factorial of %d - %d", n, fourth(n));
            case 5:
                System.out.print("Input integer number: ");
                n = scan.nextInt();
                System.out.printf("The %d element of Fibonacci sequence is %d\n", n, fifth(n));
            case 6:
                System.out.print("Input a: ");
                a = scan.nextInt();
                System.out.print("Input n: ");
                n = scan.nextInt();
                System.out.printf("%d^%d = %d\n", a, n, sixth(a, n));
            case 7:
                System.out.print("Input the length of array: ");
                n = scan.nextInt();
                System.out.printf("Input an array of %d elements: ", n);
                lst = new int[n];

                for (int i = 0; i < n; i++) { lst[i] = scan.nextInt(); }

                System.out.print("The given array in reverse order: ");
                seventh(n, lst);
            case 8:
                System.out.print("Input string: ");
                s = scan.next();
                System.out.printf("%s %s", s, eight(s) ? "consists only digits":
                        "doesn't consist only digits");
            case 9:
                System.out.print("Input n: ");
                n = scan.nextInt();
                System.out.print("Input k: ");
                k = scan.nextInt();
                System.out.printf("%d choose %d: %d", n, k, ninth(n, k));
        }
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
     * This method calculates the average of a given array
     * It uses iteration approach
     * Time complexity: O(n), where n is the length of the array
     * The iterative algorithm iterates through all numbers for 0 to n - 1
     * resulting in linear time complexity
     * @param n is a length of array, @param lst is an array, whose average is to be found
     * @return average of a given array
     */

    private static double second(int n, int[] lst) {
        int sum = 0;

        for (int x: lst) {
            sum += x;
        }


        return (double) sum / n;
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

    private static String third(int n) {
        for (int x = 2; x <= n / 2; x++) {
            if (n % x == 0) {
                return "Composite";
            }
        }

        return "Prime";
    }

    /**
     * This method calculate factorial of a given number
     * It uses recursive approach
     * Time complexity: O(n), where n is the length of the array
     * The recursive algorithm iterates through all numbers from n to 1
     * resulting in linear time complexity
     * @param n is a number whose factorial is to be found
     * @return the factorial of given number
     */

    private static int fourth(int n) {
        if (n == 0 || n == 1) return 1;

        return n * fourth(n - 1);
    }

    /**
     * This method calculate element of Fibonacci sequence
     * It uses recursive approach
     * Time complexity: O(n^2), where n is the length of the array
     * The recursive algorithm iterates through all numbers from n to 1
     * resulting in quadratic time complexity
     * @param n is a number of elements of Fibonacci sequence that to be found
     * @return the n element of Fibonacci sequence
     */

    private static int fifth(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fifth(n - 1) + fifth(n - 2);
    }

    /**
     * This method calculate the first given number to the power of the second given number
     * It uses recursive approach
     * Time complexity: O(n), where n is the length of the array
     * The recursive algorithm iterates through all numbers from n to 1
     * resulting in liniear time complexity
     * @param a is a power base
     * @param n is an exponent
     * @return a to the power of n
     */

    private static int sixth(int a, int n) {
        if (n == 0) return 1;

        return a * sixth(a, n - 1);
    }

    /**
     * This method return given array in reverse order
     * It uses recursive approach
     * Time complexity: O(n), where n is the length of the array
     * The recursive algorithm iterates through all numbers from n to 0
     * resulting in liniear time complexity
     * @param lst is array that to be reversed
     * @param n is the length of given array
     * @return given array in reverse order
     */

    private static void seventh(int n, int[] lst) {
        if (n == 0) {
            System.out.println();
            return;
        }

        System.out.print(lst[n - 1] + " ");
        seventh(n - 1, lst);
    }

    /**
     * This method return if given string consists only digits
     * It uses recursive approach
     * Time complexity: O(n), where n is the length of given string
     * The recursive algorithm iterates through all numbers from n to 0
     * resulting in linear time complexity
     * @param s is String that to be checked on the condition
     * @return true if given string consists only digits, otherwise false
     */

    private static boolean eight(String s) {
        if (s.isEmpty()) {
            return true;
        }

        if (!Character.isDigit(s.charAt(0))) return false;

        return eight(s.substring(1));
    }

    /**
     * This method calculate binomial coefficient for given numbers
     * It uses recursive approach
     * Time complexity: O(nk), where n is the length of given string
     * The recursive algorithm iterates through all numbers from n to 0
     * resulting in quadratic time complexity
     * @param n is the number of total distinct items
     * @param k is the number of particular items chosen from that total pool
     *                                    n
     * @return binomial coefficient for (   )
     *                                    k
     */

    private static int ninth(int n, int k) {
        if (k > n) return 0;
        if (n == k || k == 0) return 1;
        return ninth(n - 1, k - 1) + ninth(n - 1, k);
    }
}
