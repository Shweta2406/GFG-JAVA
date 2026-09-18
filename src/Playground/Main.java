package Playground;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        CAR c1=new CAR(2_00_000);
        CAR c2=new CAR(4_00_000);
        CAR c3=new CAR(6_00_000);
        System.out.println(c1.compareTo(c2));

        List<CAR> carlist=new ArrayList<>(List.of(c1,c2,c3));
        Comparator<CAR> carComparator=(CAR car1, CAR car2)->{
            return (int)(car1.price-car2.price);
        };
        carlist.sort(carComparator);
        System.out.println(carlist);
    }
}
