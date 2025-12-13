package functions;

import java.util.Scanner;

public class basicFunctions {
    public static void main(String[] args) {
//        Q1:- take input of two numbers and print the sum.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: "+ sum);
    }
}
