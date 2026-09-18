package Abstraction;

public class main {
    public static void main(String[] args)
    {
        //cannot create objects of abstract class
        disel_car d=new disel_car();
        d.start();
        d.stop();
        d.test();
        System.out.println(d.price);
    }
}
