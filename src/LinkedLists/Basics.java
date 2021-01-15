package src.LinkedLists;
import java.util.*;

public class Basics {
   public static class Node {
       int data;
       Node next;
       
   }
   public static class LinkedList{
       Node head;
       Node tail;
       int size;

       void addLast(int val){   //it add element to the last
           Node temp = new Node();
           temp.data=val;
           temp.next=null;

           if(size==0){
               head = tail=temp;
           } else{
               tail.next=temp;
               tail=temp;
           }
           size++;
       }
   }
   /*trial*/

   public static int getDecimalValue(Node head) {
    StringBuilder str = new StringBuilder();
  while(head != null){
      str.append(head.data);
      head = head.next;
  }
  int res = Integer.parseInt(str.toString(),2);
  return res;
}

/*trial*/


/*print linkedlist*/
   public static void printList(LinkedList list) 
   { 
       Node currNode = list.head; 
  
       System.out.print("LinkedList: "); 
  
       // Traverse through the LinkedList 
       while (currNode != null) { 
           // Print the data at current node 
           System.out.print(currNode.data + " "); 
  
           // Go to next node 
           currNode = currNode.next; 
       } 
   } 
   public static void main(String[] args) {
    LinkedList list = new LinkedList(); 
    
    list.addLast(1);
    list.addLast(0);
    printList(list); 
    // System.out.println(list.getValue());
   
   }
}
