package static_and_non_static;

public class mystaticClass {
    int a=10;
    static int b=20;

    //static methods
    static void test()
    {
       // System.out.println(a);//cannot use non static menbers from static members
        System.out.println(b);
    }
}
