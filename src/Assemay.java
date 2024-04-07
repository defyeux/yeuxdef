import java.util.Scanner;

public class Assemay {
    public static void main(String[] args) {
        int[] lst = {1, 4, 6, 2};
        int n = 4;
        reverse(lst, 4);
        System.out.println(4);
    }

    public static int find_min(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    public static double average(int[] arr, int n) {
        int sum = 0;

        for (int x: arr) {
            sum += x;
        }

        return (double) sum / n;
    }

    public static String isPrime(int n) {
        for (int x = 2; x <= n / 2; x++) {
            if (n % x == 0) {
                return "Composite";
            }
        }

        return "Prime";
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;

        return n * factorial(n - 1);
    }

    public static void counter(int n) {
        System.out.println(n);
        if (n == 0) return;
        counter(n - 1);
    }

    public static int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void reverse(int[] arr, int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        System.out.print(arr[n - 1] + " ");
        reverse(arr, n - 1);
    }


    public static String yeuxdef(String s) {
        
    }
}
