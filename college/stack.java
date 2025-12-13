package college;
import java.sql.SQLOutput;
import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        int size = 5;

//        insertion using push operation
        if(stack.size() >= size){
            System.out.println("Stack is full");
            System.out.println("Stack before adding elements " +stack);
        } else {
            stack.push(1);
            System.out.println("Adding Element in Stack " + stack);
        }
//        deletion
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            System.out.println("Before deleting " + stack);
        } else{
            stack.pop();
            System.out.println("stack after deletion operation " + stack);
        }
//        update
//        stack.set(0,0);
//        System.out.println("updated stack " + stack);

    }
}
