import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class StreamObject {
    public static void main(String[] args) {
        String names [] ={"Riya","Divya","Pornima","Komal"};
        Stream.of(names).forEach(e->System.out.println(e));
Arrays.stream(new int [] {12,43,56,78,10}).forEach(e->System.out.print(e+" "));
Arrays.stream(new int [] {2,5,3}).map(e->e*e).forEach(e->System.out.print(e+" "));;
Arrays.stream(new int [] {12,43,56,78,10}).sorted().forEach(e->System.out.println(e));

// find min
 Arrays.stream(new int [] {12,43,56,78,10}).min((x,y)->x.compareTo(y)).get();



}
}
