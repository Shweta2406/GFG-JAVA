package Collection;
import java.util.*;

public class MyList {
    public static void main(String[] args)
    {
        List<String> l1=new ArrayList<>();
        l1.add("GFG");
        l1.add("is");
        l1.add("java");
        System.out.println(l1);
        System.out.println(l1.get(2));
        System.out.println(l1.size());
        System.out.println(l1.remove(2));

    }
}
