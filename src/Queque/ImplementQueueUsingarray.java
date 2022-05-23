class Queue{
    int start =-1;
    int end =-1;
    int arr[] = new int[1000];
    int currSize =0;
    int top(){
        if(start ==-1) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        // else 
        return arr[start];
    }
    void push (int n){
        if(start ==-1){
           start++;
        }
        end++;
    arr[end] =n;
    currSize++;

    }
    int pop(){
        if(start ==-1){
            System.out.println("Empty que");
            System.exit(1);
        }
        int popped = arr[start];
        if (currSize == 1) {
            start = -1;
            end = -1;
        } else
            start = (start + 1) % 1000;
        currSize--;
        return popped;

    }
    int size(){
        return currSize;
    }
}
public class ImplementQueueUsingarray {
    public static void main(String[] args) {
        Queue q= new Queue();
        q.push(9);
        q.push(8);
        System.out.println(q.top());
        System.out.println(q.size());
        System.out.println(q.pop());

}
}
