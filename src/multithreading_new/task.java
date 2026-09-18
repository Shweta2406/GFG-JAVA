package multithreading_new;

public class task extends Thread{
    int taskid;

    public task(int taskid)
    {
        this.taskid=taskid;
    }

    @Override
    public void run()
    {
        System.out.println("executing task "+ this.taskid+" by thread "+Thread.currentThread().getName());
        try
        {
            Thread.sleep(3000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
