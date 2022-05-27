import java.util.Stack;
class Queues{
Stack <Integer> input = new Stack();
Stack <Integer> output = new Stack();
void add (int n){
    input.push(n);
}
int element(){
    if(output.isEmpty()){
        while(!input.isEmpty()){
            output.push(input.pop());
        }
      
    }
    return output.peek();
}
int poll(){
    if(output.isEmpty()){
        while(!input.isEmpty()){
            output.push(input.pop());
        }
      
    } 
return output.pop();
}
int size(){
    return input.size()+output.size();
}
boolean isEmpty(){
    return input.isEmpty() && output.isEmpty();
}
}

public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        Queues q= new Queues();
        q.add(9);
        q.add(7);
        System.out.println(q.size());
        System.out.println("peek : "+q.element());
        q.add(67);
        System.out.println("pop: "+q.poll());
    }
}
