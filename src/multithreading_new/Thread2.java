package multithreading_new;

public class Thread2 extends Thread{

    public Thread2(String name,int priority)
    {
        super(name);
        super.setPriority(priority);
    }

    @Override
    public void run()
    {
        System.out.println(super.getName() +" is running with priority "+ this.getPriority());
    }

}
