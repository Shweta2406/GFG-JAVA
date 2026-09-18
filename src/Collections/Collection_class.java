package Collections;
import java.util.*;

public class Collection_class {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(50);
        list.add(20);
        list.add(30);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,50));

        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }
}


