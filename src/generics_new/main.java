package generics_new;

import java.util.*;

public class main {
    public static void main(String[] args) {
        myGenericClass<String> g1=new myGenericClass<>("Hello");
        System.out.println(g1.element.substring(0,3));

        myGenericClass<student> g2=new myGenericClass(new student(1,"Arav"));
        //System.out.println(g2.element.substring(0,2));//this will not work because the element is of type student and it does not have a substring method
        //in order to make it work we need to create substring method in the student class and then call it here
         System.out.println(g2.element.substring(0,2));

         generic_class_with_args<student,Integer> g3=new generic_class_with_args<>(new student(1,"Arav"),100);
        System.out.println(g3.key + " " + g3.value);

        List<Integer> l1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(l1);

        genFunc f=new genFunc();
        f.display("arav");
        f.display(1);

        System.out.println(f.display1("arav",1));
        //System.out.println(f.display1(1,"arav"));this will not work because the method is defined to take a String and an Integer as arguments and we are passing an Integer and a String

        System.out.println(f.display2(2));
    }
}
