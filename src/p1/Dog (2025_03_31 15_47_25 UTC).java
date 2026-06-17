package p1;

public class Dog extends Animal{
    Dog() {
        super("black", "omnivorous", 4, "bark");
    }
    //function overriding
    void print()
    {
        System.out.println("inside dog class");
    }
}
