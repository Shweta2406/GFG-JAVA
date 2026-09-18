package Collections;
import java.util.*;
public class arraydeque {
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>();
        d.offerFirst(10);
        d.offerLast(20);
        d.offerLast(30);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        System.out.println(d);
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());
    }
}
