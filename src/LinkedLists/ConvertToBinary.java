package src.LinkedLists;

public class ConvertToBinary {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }  
    }

    public static class LinkedList{
            Node head;
            Node tail;
            int size;
    }
    public static void main(String[] args) {
    Node temp = new Node(10);
    Node head=temp;
    System.out.println(head.data);  
    head.next = new Node(1);
    System.out.println(head.next.data);

/**program */
StringBuilder str = new StringBuilder();
while(head != null){
    str.append(head.data);
    head = head.next;
}
int res = Integer.parseInt(str.toString(),2);
System.out.println(res);

    }
/** program */
}
