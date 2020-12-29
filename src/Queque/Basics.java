package src.Queque;

import java.util.*;

public class Basics {
public static void main(String[] args) {
    

    Queue<Integer> que = new ArrayDeque<>(); 
    que.add(10);
    que.add(90);
    que.add(70);
    System.out.println(que);
    que.remove();
    System.out.println(que);
    System.out.println(que.peek());

}
}