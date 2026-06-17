package Multithreading;

public class Main {
    public static void main(String[] args)
    {
        //method1
        Mythread1 t1=new Mythread1();
        t1.start();

        //method2
        Thread t2=new Thread(()->{
        for(int i=1;i<=100;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("interupted exception occured");
            }
        }
    });
        t2.start();
    }
}
