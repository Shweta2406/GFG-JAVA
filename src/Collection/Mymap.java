package Collection;
import java.util.*;

public class Mymap {
    public static void main(String[] args)
    {
        Map<Integer,String> m1=new HashMap<>();
        m1.put(101,"Shweta");
        m1.put(102,"Sara");
        m1.put(103,"Arav");

        System.out.println(m1);
        System.out.println(m1.size());

        m1.put(102,"sahil");
        System.out.println(m1);

        m1.remove(103);
        System.out.println(m1);

        System.out.println(m1.containsKey(102));
    }
}
