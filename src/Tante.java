import java.util.Scanner;

public class Tante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose number 1-10");
        int ch = scan.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Input n: ");
                int n = scan.nextInt();
                System.out.print("Input an array of n elements: ");
                int[] lst = new int[n];

                for (int i = 0; i < n; i++) {
                    lst[i] = scan.nextInt();
                }

                System.out.printf("The minimum of them: %d\n", first(n, lst));
        }
    }

    public static int first(int n, int[] lst) {
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
     * Time complexity: O(n), where n is the input number
     * The iterative algorithm iterates through all numbers from 1 to n - 1
     * resulting in linear time complexity
     * @param n is a length of array, @param lst is an array, whose minimun element is to be found
     * @return number is a minimun of given array
     */

}
