package Collections;
import java.sql.SQLOutput;
import java.util.*;

public class Arrays_class
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.binarySearch(arr,3));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2=new int[5];
        Arrays.fill(arr2,-1);
        System.out.println(Arrays.toString(arr2));
    }

}
