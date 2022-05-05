import java.util.ArrayList;
import java.util.List;


public class UnderstandingStreams {
   public static void main(String[] args) {
        List<Integer> va = new ArrayList<>();
   for(int i=1;i<=100;i++){
       va.add(i);
   }
   va.stream();
   va.parallelStream().forEach(System.out:: print);

// methods
//    filter()
//    Map
//    findFirst()
//    forEach


   }
}
