package tarun;

import java.util.Scanner;

public class nestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Tarun");
                break;
            case 2:
                System.out.println("Shivang");
                break;
            case 3:
                System.out.println("Emp no. 3");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department exist");
                }
                break;
            default:
                System.out.println("No emp with this name");
        }
    }
}
