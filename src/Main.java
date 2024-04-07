import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) System.out.printf("%d)\n", i);
    }

    public static int first(int n) {
        if (n == 1) return 1;
        return n * n + first(n - 1);
    }

    public static double fourth(int b, int n) {
        if (n == 0) return 1;
        return Math.pow(b, n) + fourth(b, n - 1);
    }

    public static void fifth(int n, int[] lst) {
        if (n == 0) return;
        System.out.print(lst[n - 1] + " ");
        fifth(n - 1, lst);
    }

    public static void sixth(int n, String[] lst) {
        if (n == 0) return;
        System.out.println(lst[n - 1]);
        sixth(n - 1, lst);
    }

    public static void generateArr(int n, int k, int index, int[] arr){
        if(index == n){
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= k; i++ ){
            arr[index] = i;
            generateArr(n, k, index + 1, arr);
        }
    }
}