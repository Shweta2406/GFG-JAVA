package exception_handling;
//there are 2 ways to handle compile time exceptions:-
//1) try-catch block in which we write the code that may throw an exception in try block and handle the exception in catch block
//2) throws keyword in which we declare the exception in method signature and handle it in calling method
public class compileTime2 {
    static int test(int a,int b) throws Exception
    {
        if(a<b)
        {
            return a+b;
        }
        else
            throw new Exception("Exception thrown");

    }

    static void print(int a,int b) throws Exception
    {
        test(a,b);
    }

    public static void main(String[] args) {
        try {
            print(40, 20);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
