package Playground;

public class CAR implements Comparable<CAR>{
    double price;
    public CAR(double price)
    {
        this.price=price;
    }
    @Override
    public int compareTo(CAR o)
    {
        return (int)(this.price-o.price);
    }
}
