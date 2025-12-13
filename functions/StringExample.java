package functions;

import java.util.Scanner;
//import java.sql.SQLOutput;

public class StringExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "How are You";
        return greeting;
    }
}
