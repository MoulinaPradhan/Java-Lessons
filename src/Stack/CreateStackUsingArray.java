 class  Stack{
    int top = -1;
    int arr[] = new int[1000];
    void push (int n){
        top++;
        arr[top] = n;
    }
    int pop(){
        int x = arr[top];
        top--;
        return x;
    }
    int peek(){
      return arr[top];  
    }
    int size(){
        return top+1;
    }
    
}

public class CreateStackUsingArray {

    public static void main(String[] args)
 {
    Stack st = new Stack();
       st.push(8);
       System.out.println(st.pop());
       st.push(7);
       System.out.println(st.peek());
System.out.println(st.size());       

    }
    
}
