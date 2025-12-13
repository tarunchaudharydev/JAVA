package tarun;

import java.util.Scanner;

public class fibonacci_nth {
    public static void main(String[] args) {
    int a = 0;
    int b = 1;
    Scanner sc = new Scanner(System.in);
    int user_input = sc.nextInt();
    if (user_input <= 0){
        System.out.println("Enter greater than Zero");
    } else if (user_input == 1) {
        System.out.println(a);
    } else if (user_input == 2) {
        System.out.println(a);
        System.out.println(b);
    } else{
        System.out.println("0");
        System.out.println("1");
        for(int i = 1; i <= user_input - 2; i++){
            int sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
//        System.out.println(sum);
    }
    }
}
