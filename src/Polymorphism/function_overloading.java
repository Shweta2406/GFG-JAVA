package Polymorphism;

//2 types of polymorphism:-
//1) compile time-function overloading
//2) runtime-function overriding

public class function_overloading {
    static int add(int a,int b)
    {
        return a+b;
    }

    static int add(int a,int b,int c)
    {
        return a+b+c;
    }

    static double add(double a,double b,int c)
    {
        return a+b+c;
    }

    public static void main(String args[])
    {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1.1,2.2,3));
    }
}
