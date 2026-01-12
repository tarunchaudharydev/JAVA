package functions;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);
//
        System.out.println(a + " " + b);
    }

    static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return swap(a, b);
    }
}
