package Collections;
import java.util.*;

public class treemap {
    public static void main(String[] args) {
        //TreeMap is a class that implements the Map interface and is based on a Red-Black tree. It is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time. It does not allow null keys but allows null values.
        Map<Integer,String> m=new TreeMap<>();
        m.put(1,"one");
        m.put(2,"two");
        m.put(3,"three");
        m.putIfAbsent(2,"fourteen");
        System.out.println(m.containsKey(1));
        System.out.println(m.containsValue("two"));
        System.out.println(m.get(3));
        System.out.println(m);

        for(Map.Entry<Integer,String> e:m.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        for(Integer x: m.keySet())
        {
            System.out.println(x);
        }
        for(String s: m.values())
        {
            System.out.println(s);
        }
        m.remove(2);
        System.out.println(m);

    }
}
