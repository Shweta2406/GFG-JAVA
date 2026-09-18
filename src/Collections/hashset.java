package Collections;
import java.util.*;
public class hashset {
    public static void main(String[] args)
    {
        Set<Integer> s=new HashSet<>();
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
