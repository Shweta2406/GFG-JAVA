public class multithreading {
    public static void main(String[] args) {
        Thread t1=new Thread(()->
        {
            System.out.println(Thread.currentThread());
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread 1: "+i);
            }
        });

        Thread t2=new Thread(()->
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread 2: "+i);
            }
        });

        t1.start();
        try {
            System.out.println(Thread.currentThread());
            t1.join();
        }catch(InterruptedException e)
        {
            throw new RuntimeException();
        }
        t2.start();


    }
}
