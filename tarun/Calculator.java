package tarun;

import java.util.Scanner;
public class Calculator {
//    public static char calculator(char n){
//
//    }
//}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;
//        take input from user till user does not press 'x' or 'X'
        while(true){
//            take the operator as input
            char operator = in.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '%' || operator == '/'){
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(operator == '+'){
                    answer = num1 + num2;
                }
                if(operator == '-'){
                    answer = num1 - num2;
                }
                if(operator == '*'){
                    answer = num1 * num2;
                }
                if(operator == '/'){
                    if(num2 != 0){
                        answer = num1 / num2;
                    }
                }
                if(operator == '%'){
                    answer = num1 % num2;
                }
            } else if(operator == 'x' || operator == 'X'){
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(answer);
        }
    }
}