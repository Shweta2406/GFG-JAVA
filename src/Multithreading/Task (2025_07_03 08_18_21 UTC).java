package Multithreading;

public class Task extends Thread{
    private int taskid;

    public Task(int taskid)
    {
        this.taskid=taskid;
    }
    @Override
    public void run()
    {
        System.out.println("Executing task "+ this.taskid +" by "+ Thread.currentThread().getName());
        try{
            Thread.sleep(2*1000L);
        }catch(InterruptedException e)
        {
            System.out.println("interupted exception");
        }
    }
}
