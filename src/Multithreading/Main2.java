package Multithreading;

public class Main2 {
    public static void main(String args[])
    {
        ThreadGroup tg1=new ThreadGroup("Before cooking");
        Thread t1=new Thread(tg1,()->{
            System.out.println("Food items ordered");
            try
            {
                Thread.sleep(10*1000L);
            } catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println("Food items recieved");
        });

        Thread t2=new Thread(tg1,()->{
            System.out.println("cleaning utensils started");
            try
            {
                Thread.sleep(5*1000L);
            } catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println("cleaning utensils finished");
        });

        Thread t3=new Thread(()->{
            System.out.println("cooking omlette started");
            try
            {
                Thread.sleep(4*1000L);
            } catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println("cooking Omlette finished");
        });

        Thread t4=new Thread(()->{
            System.out.println("cooking bread started");
            try
            {
                Thread.sleep(2*1000L);
            } catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println("cooking bread finished");
        });

        Thread t5=new Thread(()->{
            System.out.println("serving started");
            try
            {
                Thread.sleep(1*1000L);
            } catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println("serving finished");
        });

        try{
            System.out.println(Thread.currentThread());//thraed which is currently running
            t1.start();
            t2.start();
            System.out.println("active threads in tg1: "+tg1.activeCount());
            tg1.list();

            t1.join();
            t2.join();

            //t3 and t4 will wait until t1 and t2 finishes
            t3.start();
            t4.start();

            t3.join();
            t4.join();
            t5.start();
        }catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }


    }
}
