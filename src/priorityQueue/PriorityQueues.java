package src.priorityQueue;


import java.util.*;

public class PriorityQueues{
    public static void main(String[] args) {

PriorityQueue<String> pq=new PriorityQueue();
        
pq.add("Kiwi");
System.out.println(pq);
pq.add("Apple");
pq.add("Orange");
pq.add("Banana");
pq.add("Guava");

System.out.println(pq);

//while deleting its coming in chronological way

System.out.println(pq.remove());
System.out.println(pq.remove());
System.out.println(pq.remove());
System.out.println(pq.remove());

    }
}