package inheritence;

public class main {
    public static void main(String[] args)
    {
        animal a=new animal("black",4,"bark","nonveg");
        System.out.println(a);
        a.print();

        cat c=new cat("orange","persian");
        System.out.println(c);
        c.print();
    }
}
