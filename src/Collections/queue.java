package Collections;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q.poll());
        System.out.println(q.peek());

        //functions of queue that throw exception
        Queue<Integer> q1=new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        System.out.println(q1.remove());
        System.out.println(q1.element());

    }
}
