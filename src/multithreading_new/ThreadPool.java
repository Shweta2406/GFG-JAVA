package multithreading_new;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//thread pool is a collection of threads which are idle and ready to execute the task
//we can create thread pool using Executors class
//executor service is an interface which provides methods to execute the task
//we can schedule fixed number of threads to execute the task

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService e1= Executors.newFixedThreadPool(3);//create 3 threads which are idle
        for(int i=1;i<8;i++)
        {
            e1.execute(new task(i));
        }
        e1.shutdown();//after shutdown new task can't be executed

    }
}
