public class Yeuxdef {
    public static void main(String[] args) {
//        int[] lst = {1, 2, 3, 4, 5};
//        System.out.println(second(lst.length, lst));
        System.out.println(sixth(2, 10));
    }

    private static int first(int n, int[] lst) {
        if (n == 1) return lst[0];

        if (first(n - 1, lst) > lst[n - 1]) return lst[n - 1];

        return first(n - 1, lst);
    }

    private static double second(int n, int[] lst) {
        int sum = 0;

        for (int x: lst) {
            sum += x;
        }

        return (double) sum / lst.length;
    }

    private static String third(int n) {
        for (int x = 2; x <= n / 2; x++) {
            if (n % x == 0) return "Composite";
        }

        return "Prime";
    }

    private static int fifth(int n) {
        if (n == 0 || n == 1) return 1;

        return n * fifth(n - 1);
    }

    private static int sixth(int a, int n) {
        if (n == 0) return 1;
        return a * sixth(a, n - 1);
    }
}