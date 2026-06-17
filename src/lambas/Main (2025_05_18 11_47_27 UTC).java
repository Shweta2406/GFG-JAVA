package lambas;

public class Main {
    public static void main(String[] args)
    {
        GfgClass g=new GfgClass();
        g.test1();
        MyFunctionalInterface g1=new GfgClass();
        test(g1);
        //g1.name();//cannot access because this variable name is in child class

//        Myclass m=new Myclass();
//        m.test1();

        //lambas to implement functional interface without creating class
        MyFunctionalInterface m= () ->
        {
            System.out.println("Myclass-test1");
        };
    }

    public static void test(MyFunctionalInterface f)
    {
        f.test1();
    }

}
