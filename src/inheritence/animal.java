package inheritence;

import java.sql.SQLOutput;

public class animal {
    int noOfLegs;
    String color;
    String sound;
    String diet;

    public animal(String color, int noOfLegs, String sound, String diet) {
        this.color = color;
        this.noOfLegs = noOfLegs;
        this.sound = sound;
        this.diet = diet;
    }

    public void print()
    {
        System.out.println("inside animal class");
    }
}
