package Collections;
import java.util.*;
public class linkedhashset {
    public static void main(String[] args)
    {
        //maintains order of insertion and does not allow duplicates
        Set<Integer> s=new LinkedHashSet<>();
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
