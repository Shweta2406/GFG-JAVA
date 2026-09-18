package static_and_non_static;

public class main {
    public static void main(String[] args)
    {
        //accessing non static variables
        mystaticClass c=new mystaticClass();
        System.out.println(c.a);
        c.a=15;
        System.out.println(c.a);

        mystaticClass c2=new mystaticClass();
        System.out.println(c2.a);

        //accessing static variables-bound to class not objects
        System.out.println(mystaticClass.b);

        //accessing static method
        mystaticClass.test();


    }
}
