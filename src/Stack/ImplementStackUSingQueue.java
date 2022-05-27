import java.util.LinkedList;
import java.util.Queue;

class Stack1{
    Queue<Integer> q = new LinkedList<>();
    void push (int n){
        q.add(n);
        for(int i=0;i<q.size()-1;i++){
        q.add(q.remove());
        }
    }
    int peek(){
        return q.element();
    }
    int pop(){
        return q.poll();
    }

}
public class ImplementStackUSingQueue {
    public static void main(String[] args) {
      Stack1 st1 =new Stack1();
      st1.push(4);
      st1.push(3);
      System.out.println(st1.peek());
        
    }

}
