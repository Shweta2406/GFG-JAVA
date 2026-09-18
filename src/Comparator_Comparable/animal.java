package Comparator_Comparable;

public class animal implements Comparable<animal>{
    String name;
    int age;
    int weight;

    public animal(String name,int age,int weight) {
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}'+'\n';
    }

    @Override
    public int compareTo(animal o) {
        return this.name.compareTo(o.name);
    }
}
