package Multithreading;

public class priority {
    public static void main(String[] args)
    {
        Mythread1 t1=new Mythread1("Low priority",1);
        Mythread1 t2=new Mythread1("normal priority",5);
        Mythread1 t3=new Mythread1("High priority",10);

        t1.start();
        t2.start();
        t3.start();


    }
}
