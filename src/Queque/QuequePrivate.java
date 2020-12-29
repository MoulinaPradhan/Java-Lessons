package src.Queque;
import java.util.*;

/**
 * Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
 */

public class QuequePrivate {
    public static void main(String[] args) {
        System.out.println("Hi");
    }

    class RecentCounter{
        private Queue<Integer> queue;
            public RecentCounter(){
                 queue = new LinkedList<>();
            }
    public int ping(int t){
        queue.add(t);
        while (t-queue.peek()>3000) {
            queue.poll();
            
        }
        return queue.size();
    }
    
    }








}
