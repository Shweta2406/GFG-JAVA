package multithreading_new;

public class main {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();//to start the thread we use start method and not run method because if we use run method it will not create a new thread it will just execute the run method in the main thread

        //method 2 of creating thread is by implementing runnable interface
        Thread t2=new Thread(()->
        {
            System.out.println("thread2 is running");
        });
        t2.start();

        Thread t3=new Thread(()->
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
                try
                {
                    Thread.sleep(1000*3);//to make the thread sleep for 1 second
                }
                catch(InterruptedException e)
                {
                    System.out.println("interrupted exception caught");
                }
            }
        });
        t3.start();
        System.out.println("inside main thread");
        try {
            Thread.sleep(1000 * 8);
        }catch(InterruptedException e)
        {
            System.out.println("interrupted exception caught in main thread");
        }
        System.out.println("main thread is ending");
    }
}
