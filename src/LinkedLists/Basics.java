package src.LinkedLists;

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
    list.addLast(10);
    list.addLast(40);
    printList(list); 
   }
}
