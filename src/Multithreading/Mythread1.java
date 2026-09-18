package Multithreading;

public class Mythread1 extends Thread{
public Mythread1()
{

};
//    public Mythread1(ThreadGroup tg1,String name)
//    {
//        super(tg1,name);
//    }
    public Mythread1(String name,int priority)
    {
        super(name);
        super.setPriority(priority);

    }
    @Override
    public void run()
    {
        System.out.println("Thread 1 is running with priority "+this.getPriority());
    }

}
