package p1;

public class Animal {
    String colour;
    String diet;
    int legs;
    String sound;

    Animal(String colour,String diet,int legs,String sound)
    {
        this.colour=colour;
        this.diet=diet;
        this.legs=legs;
        this.sound=sound;
    }
    Animal()
    {

    }

    void print()
    {
        System.out.println("inside animal class");
    }
}
