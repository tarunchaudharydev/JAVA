package college;
import java.util.*;

public class stackQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int size = 5;

        if (queue.size() >= size) {
            System.out.println("queue is full");
        } else {
            System.out.println("queue before adding " + queue);
            queue.add(1);
            System.out.println("queue after adding " + queue);
        }

        if (queue.isEmpty()) {
            System.out.println("queue is empty");
        } else {
            System.out.println("queue before deletion " + queue);
            queue.remove();
            System.out.println("Queue after deletion " + queue);
        }
//        LinkedList<Integer> list = (LinkedList<Integer>)queue;
//        list.set(0,2);
//        System.out.println(queue);

    }
}
