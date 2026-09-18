package Collections;
import java.util.*;

public class student_list {
    public static void main(String[] args) {
        List<student> l=new ArrayList<>();
        l.add(new student(10,"Alice"));
        l.add(new student(20,"Bob"));
        l.add(new student(15,"Charlie"));
        System.out.println(l);

        Collections.sort(l);
        System.out.println("After sorting by roll_no: " + l);

        student s1=new student(20,"Bob");
        student s2=new student(15,"Charlie");

        // Demonstrate compareTo method
        int comparison = s1.compareTo(s2);
        System.out.println("s1.compareTo(s2): " + comparison + " (positive means s1 > s2)");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        Collections.sort(l,(x1,x2)->
        {
            return x1.name.compareTo(x2.name);
        });
        System.out.println("After sorting by name: " + l);

    }
}
