package streams_new;
import java.util.*;
import java.util.stream.*;

class student
{
    int roll_no;
    String name;
    int marks;

    public student(int roll_no, String name, int marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

//stream is pipeline of functions that we perform on source. source can be collection, array, generator function etc. stream is not data structure but it is a view of data structure. stream is not mutable but it is immutable. stream is not thread safe but it is not thread safe. stream is not lazy but it is lazy. stream is not parallel but it can be parallel. stream is not sequential but it can be sequential. stream is not ordered but it can be ordered. stream is not sorted but it can be sorted. stream is not distinct but it can be distinct. stream is not filter but it can be filter. stream is not map but it can be map. stream is not flatmap but it can be flatmap. stream is not reduce but it can be reduce. stream is not collect but it can be collect. stream is not forEach but it can be forEach. stream is not anyMatch but it can be anyMatch. stream is not allMatch but it can be allMatch. stream is not noneMatch but it can be noneMatch. stream is not findFirst but it can be findFirst. stream is not findAny but it can be findAny.
public class example1 {
    public static void main(String[] args)
    {
        //stream to calculate sum
        int[] arr1={1,2,3,4,5};
        int sum=Arrays.stream(arr1)
                .sum();
        System.out.println(sum);

        //stream to calculate max
        int maxi=Arrays.stream(arr1)
                .max()
                .getAsInt();
        System.out.println(maxi);

        //average
        double avg=Arrays.stream(arr1)
                .average()
                .getAsDouble();
        System.out.println(avg);

        //print n natural no with given digit
        Stream.iterate(1,x->x+1)
                .filter(x->x.toString().contains("5"))
                .limit(10)
                .forEach(str-> System.out.println(str));

        //print strings which begin with a and end with e in lexiographical order
        String[] arr3={"apple","banana","grape","avocado","orange","peach"};

        String[] ans=Arrays.stream(arr3)
                .filter(x->x.startsWith("a"))
                .filter(x->x.endsWith("e"))
                .sorted()
                .toArray(String[]::new);
        System.out.println(Arrays.toString(ans));

        //stream to calculate average marks of students
        List<student> l1=new ArrayList<>(Arrays.asList(
                new student(1,"Alice",85),
                new student(2,"Bob",90),
                new student(3,"Charlie",90),
                new student(4,"David",95),
                new student(5,"Eve",70)));

        double res=l1.stream().mapToInt(x->x.getMarks())
                .average()
                .getAsDouble();
        System.out.println(res);

        //collect in map
        Map<String,Integer> m=l1.stream()
                .collect(Collectors.toMap(x->x.name,x->x.marks));

        System.out.println(m);

        //group by marks
        Map<Integer,List<student>> grouped=l1.stream()
                .collect(Collectors.groupingBy(student::getMarks));
        System.out.println(grouped);

        //custom sorting using streams
        List<student> l2=l1.stream()
                .filter(x->x.getMarks()>60)
                .sorted((s1,s2)->s2.getMarks()-s1.getMarks())
                .toList();
        System.out.println(l2.toString());

    }
}
