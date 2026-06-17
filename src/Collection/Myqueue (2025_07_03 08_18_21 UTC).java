package Collection;
import java.util.*;

public class Myqueue {
    public static void main(String[] args)
    {
        Queue<String> q1=new LinkedList<>();
        q1.add("Aa");
        q1.add("Bb");
        q1.add("Cc");
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        //q1.remove();  throw exception when queue is empty
    }
}
