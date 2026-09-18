package inheritence;

public class cat extends animal{
    String breed;
    public cat(String color,String breed)
    {
        super(color,4,"meow","veg");
        this.breed=breed;
    }

    @Override
    public void print()
    {
        System.out.println("inside cat class");
    }
}
