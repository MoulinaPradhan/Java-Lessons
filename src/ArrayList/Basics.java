package src.ArrayList;

import java.util.*;

public class Basics {
 
    
public static void main(String[] args) {
    ArrayList<Integer> list= new ArrayList<>();
    System.out.println(list+" ->"+ list.size());

    //add
    list.add(10);
    list.add(30);
    list.add(40);
    list.add(90);

 
System.out.println(list+ " ->" + list.size());
list.set(1,50);      // not list[1]=50
int  val =list.get(2);     // not list[2]
System.out.println(list+ " ->" + list.size());
System.out.println(val);


list.remove(1);
System.out.println(list+" ->"+list.size());


//to find the frequency of the number 
System.out.println("The frequency of 1: "+  
Collections.frequency(list, 10));

System.out.println(list.contains(10));



}

}