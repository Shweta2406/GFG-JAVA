package multithreading_new;

public class threadGroup {
    public static void main(String[] args) {
        ThreadGroup tg1=new ThreadGroup("thread group 1");
        Thread t1=new Thread(tg1,()->
        {
            System.out.println("thread1");
        });
        Thread t2=new Thread(tg1,()-> System.out.println("thread2"));
        Thread t3=new Thread(tg1,()-> System.out.println("thread3"));
        t1.start();
        t2.start();
        System.out.println(tg1.activeCount());
        tg1.interrupt();
        t3.start();
        System.out.println(tg1.activeCount());




    }
}
