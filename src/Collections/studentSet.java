package Collections;
import java.util.*;

public class studentSet {
    public static void main(String[] args) {
        Set<student> s=new HashSet<>();
        s.add(new student(1,"Arav"));
        s.add(new student(2,"Babita"));
        s.add(new student(3,"Aarav"));

        Set<student> s2 =new HashSet<>();
        s2.add(new student(1,"Arav"));
        s2.add(new student(2,"Babita"));
        s2.add(new student(3,"Aarav"));
        System.out.println(s.equals(s2));

        System.out.println(s2);

    }
}
