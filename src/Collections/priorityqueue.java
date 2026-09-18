package Collections;
import java.util.*;
public class priorityqueue {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.offer(5);
        q.offer(2);
        q.offer(8);
        q.offer(1);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.peek());

        Queue<Integer> q1 =new PriorityQueue<>(Comparator.reverseOrder());
        q1.offer(5);
        q1.offer(2);
        q1.offer(8);
        q1.offer(1);
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1.peek());

    }
}
