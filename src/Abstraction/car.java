package Abstraction;

public abstract class car {
    //non abstract members
    int price=10;
    void test()
    {
        System.out.println("inside car class");
    }

    //abstract functions
    abstract void start();
    abstract void stop();

}
