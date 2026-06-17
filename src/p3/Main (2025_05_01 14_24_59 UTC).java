package p3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
               try {
                   mytest(2,3);
               }
               catch(Exception e)
               {
                   //e.getMessage();
                   System.out.println(e);
               }

        finally
        {
            System.out.println("inside finally");
        }

    }


    static void mytest(int a, int b) throws Exception {
        if(a>b)
        {
            System.out.println(a);
        }
        else
        {
            throw new shwetaexception("Shweta's exception");
        }
        System.out.println(b);
    }
}