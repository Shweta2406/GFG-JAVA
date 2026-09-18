package streams;

import java.util.List;

public class parallelStream {
    public static void main(String[] args)
    {
        List<String> name= List.of("Arav","Babil","Carl");
        name.parallelStream().forEach(n-> System.out.println(Thread.currentThread().getName()+" - "+n));
    }
}
