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
}
