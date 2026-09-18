package Polymorphism;

class temp
{
     void test()
    {
        System.out.println("org test function");
    }
}

public class function_overriding extends temp{

    @Override void test()
    {
        System.out.println("overriden test function");
    }

    public static void main(String[] args)
    {
       temp t= new temp();
       t.test();
       function_overriding f=new function_overriding();
       f.test();

    }
}
