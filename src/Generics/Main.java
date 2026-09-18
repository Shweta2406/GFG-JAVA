package Generics;

public class Main {
    public static void main(String[] args)
    {
        MyGenerics<String> m1=new MyGenerics<>("Shweta");
        MyGenerics<Integer> m2=new MyGenerics<>();
        System.out.println(m1.element.substring(0,2));
       // System.out.println(m2.element.substring(0,2));//error

    pair<String,Integer> p1=new pair("Arya",101);
        System.out.println(p1.key);
        System.out.println(p1.value);


        genFunc g=new genFunc();
        g.printV("Shweta");
        g.printV(5);
    }


}
