package multithreading_new;

public class priority {
    public static void main(String[] args) {
         Thread2 t1=new Thread2("Thread 1",10);
            Thread2 t2=new Thread2("Thread 2",1);
            Thread2 t3=new Thread2("Thread 3",5);
            t1.start();
            t2.start();
            t3.start();
    }
}
