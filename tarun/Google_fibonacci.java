package tarun;

public class Google_fibonacci {
    public static long fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative not allowed");
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++){
            long sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}
