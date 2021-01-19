package src.priorityQueue;
import java.util.*;

public class HeapSort {
    
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq= new PriorityQueue<>(); for accending order
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());  // to reverse the order
        int [] ranks = { 22, 99, 3, 11, 88, 4, 1};

        for(int val : ranks){
            pq.add(val);
        }

        while(pq.size() > 0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
