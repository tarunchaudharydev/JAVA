package tarun;

import java.util.Scanner;

public class CaseCheck {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
//        String word = "hello";
//        System.out.println(word.charAt(0));
        if(ch >= 'a' && ch <= 'z'){
            System.out.printf("The character %c is Small case ",ch);
        }
        if(ch>= 'A' && ch <= 'Z'){
            System.out.printf("The character %c is Capital case ",ch);
        }
//        System.out.println(ch);
    }
}
