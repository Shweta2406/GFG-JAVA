package Collections;
import java.util.*;
public class treeset {
    public static void main(String[] args)
    {
        //in sorted order-O(log n
        Set<Integer> s=new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(1);
        System.out.println(s);
        s.remove(1);
        System.out.println(s);
        System.out.println(s.contains(3));
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
