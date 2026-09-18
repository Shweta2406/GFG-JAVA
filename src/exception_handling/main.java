package exception_handling;

public class main {
    public static void main(String[] args)
    {
        try {
            if (5 > 2) {
                throw new custom_exception_R("custom exception thrown");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
