package OOPS;

class Apartment
{
    int floors;
    int flats;
    int rooms;
    String color;

    Apartment(int floors,int flats,int rooms,String color)
    {
        //this();
        this.floors=floors;
        this.flats=flats;
        this.rooms=rooms;
        this.color=color;
    }

//    private Apartment()
//    {
//
//    }

    Apartment()
    {

    }

    void Apart()
    {
        floors=0;
        System.out.println(floors);
    }
}

public class basics_of_oops {
    public static void main(String[] args)
    {
        Apartment a1=new Apartment(5,20,100,"white");
        System.out.println(a1.floors);
        a1.Apart();
        Apartment a2=new Apartment();
        a2.floors=5;
        System.out.println(a2.floors);
    }
}
