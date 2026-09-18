package streams;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        List<String> l1=List.of("Apple","Mango","Pineapple");//cannot be modified/added later
        //l1.add("Banana");
        System.out.println(l1);

        Stream<String> fruitStream=l1.stream();
        fruitStream.forEach(s -> System.out.println(s));

        List<Integer> l2=List.of(1,2,3,4,5);
        long Count=l2.stream()
                .filter(i->i%2==0)
                .count();
        System.out.println(Count);

        List<Integer> l3=List.of(11,12,12);
        List<Integer> sqr_of_count=l2.stream().
                filter(j->j%2==0)
                .map(j->j*j)
                .toList();//after this no operation
        System.out.println(sqr_of_count);
    }
}
