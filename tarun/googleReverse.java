package tarun;

public class googleReverse {

    public static int reverse(int n) {
        boolean isNegative = n < 0;
        n = Math.abs(n);

        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return isNegative ? -rev : rev;
    }

    public static void main(String[] args) {
        int n = -23597;
        System.out.println(reverse(n));
    }
}