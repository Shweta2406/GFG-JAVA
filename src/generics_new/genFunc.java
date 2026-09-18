package generics_new;

public class genFunc {

    public <T> void display(T t)
    {
        System.out.println(t);
    }


    public <T> T display1(String name,T t)
    {
        return t;
    }

    public static <E> int display2(int a)
    {
        return a;
    }

}
