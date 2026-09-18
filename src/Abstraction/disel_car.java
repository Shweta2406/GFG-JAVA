package Abstraction;

public class disel_car extends car{
    @Override void start()
    {
        System.out.println("starts disel car");
    }

    @Override void stop()
    {
        System.out.println("stops disel car");
    }
}
