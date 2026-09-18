package functional_Interface_lambas;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args)
    {
        myFunctionalInterface f=()->
        {
            System.out.println("hello world");
        };
        f.test();
        List<student> l=new ArrayList<>();
        l.add(new student("s1",20));
        l.add(new student("s2",21));
        l.add(new student("s3",22));
        l.sort((s1,s2)-> Integer.compare(s2.roll_no, s1.roll_no));
        System.out.println(l);
    }
}
