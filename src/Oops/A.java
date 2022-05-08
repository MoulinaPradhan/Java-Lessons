import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

// public class A {

//         protected int p;
//         public int q;
         
//      }


// interface  A{
//     public default void secure(){

//     }
//     interface B{
//         public default void secure(){

//         }
//         class Execute implements A,B{
//            public  d secure( ){

//            }
//         }
//     }
// }
public class A{
    // static void doStuff(){
    //     throw new Exception();
    // }
    public static void main(String[] args) {
    //     try{
    //         doStuff();
    //     }catch(Exception e)System.out.println("From Excetp");
    // }

    List<String> list = new ArrayList<>();
    list.add("Java");
    list.add("World");
    list.add("java");
    Consumer<List<String>> consumer = Collections :: reverse;
    consumer.accept(list);
    System.out.println(list);
}
}