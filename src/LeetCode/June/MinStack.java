class MinStack {

    Stack<Integer> st = new Stack<>();
     int min = Integer.MAX_VALUE;
     public void push(int x) {
       if(x <= min){
           st.push(min);
           min =x;
       }
       st.push(x);
     }
     
     public void pop() {
         int peek = st.pop();
         if (peek == min){
             min = st.pop();
         }
         
     }
     
     public int top() {
      return st.peek();   
     }
     
     public int getMin() {
         return min;
     }
 }

 
 // using node


 class MinStack {
    private Node head;
    
    public void push(int x) {
        if(head == null) 
            head = new Node(x, x);
        else 
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
    
    private class Node {
        int val;
        int min;
        Node next;
        
        private Node(int val, int min) {
            this(val, min, null);
        }
        
        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}