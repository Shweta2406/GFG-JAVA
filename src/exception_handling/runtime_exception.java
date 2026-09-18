package exception_handling;

public class runtime_exception {
    static int divide(int a,int b)
    {
        return a/b;
    }

    public static void main(String[] args)
    {
        try {
            //System.out.println(divide(10, 0));
            int[] a=new int[1];
            System.out.println(a[2]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("runtime exception thrown");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("runtime exception caught");
        }
    }
}