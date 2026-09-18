package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadPool {
    public static void main(String[] args)
    {
        ExecutorService e1= Executors.newFixedThreadPool(3);//create 3 threads which are idle
        for(int i=1;i<=9;i++)
        {
            e1.execute(new Task(i));
        }
        e1.shutdown();//after shutdown new task can't be executed
    }
}

//FixedThreadPool
//CachedThreadPool
//ScheduledThreadPool
//Future and callable