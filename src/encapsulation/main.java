package encapsulation;

public class main {
    //in encapsulation, inner block can access outer block mebers but not vice versa
    int a=10;
    {
        int b=20;
        int res=a+b;
    }
    //b=30;
}
