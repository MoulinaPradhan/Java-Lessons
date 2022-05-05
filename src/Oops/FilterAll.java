// create a list and filter all even numbers
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterAll{
public static void main(String[] args) {
    List<Integer> li1 = List.of(2,4,5,6,7);
    System.out.println(li1);
    List<Integer> li2 = Arrays.asList(23,6,7,4, 90,45,78,89);
    System.out.println(li2);

    // filter all even numbers from li1
    List<Integer>h1 =  li1.stream().filter(i->i%2 == 0).collect(Collectors.toList());
    System.out.println(h1);

    // filter all number greater than 50
    List<Integer> h2 = li2.stream().filter(i-> i>50).collect(Collectors.toList());
    System.out.println(h2);


}
}