package multithreading_new;

public class thread1 extends Thread{

    //run method is used to define the code that will be executed when the thread is started
    @Override
    public void run()
    {
        System.out.println("thread1 is running");
    }
}
