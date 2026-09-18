package exception_handling;
//there are 2 ways to handle compile time exceptions:-
//1) try-catch block in which we write the code that may throw an exception in try block and handle the exception in catch block
//2) throws keyword in which we declare the exception in method signature and handle it in calling method
public class compileTime1 {
    static int test(int a,int b)
    {
        if(a<b)
        {
            return a+b;
        }
        else {
            try {
                throw new Exception("Exception thrown");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println("hello");
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(test(40, 20));
        System.out.println('h');
    }
}
