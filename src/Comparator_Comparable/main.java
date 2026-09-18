package Comparator_Comparable;
import java.util.*;

public class main {
    public static void main(String[] args) {
        animal a=new animal("dog",4,15);
        animal b=new animal("cat",3,10);
        animal c=new animal("rabbit",2,5);

        List<animal> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //comparator
        Collections.sort(list,(a1,b1)->
        {
            return a1.age-b1.age;
        });
            System.out.println(list);
    }
}
