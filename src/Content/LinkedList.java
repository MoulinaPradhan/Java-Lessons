
class LinkedList {
      int data;
      LinkedList next;
      LinkedList () {}
      LinkedList (int data) 
      {
           this.data = data;
      }
      LinkedList (int data, LinkedList next) 
      { 
          this.data = data; 
          this.next = next; 
        }
  }

class Solution {
  public static void main(String[] args) {
     LinkedList l1 = new LinkedList (3);
     l1.next= new LinkedList (9);
     l1.next.next=new LinkedList(8);
     l1.next.next.next = new LinkedList(2);
     l1.next.next.next.next= new LinkedList(4);
     l1.next.next.next.next.next= new LinkedList(5);   
     System.out.println(pairSum(l1));
  }
  public static int pairSum(LinkedList head) {
    if(head == null){
        return 0;
    }
    if(head.next==null){
        return head.data;
    }
    LinkedList slow = head;
    LinkedList fast = head;
    // find the middle point of the linked list
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    slow = reverse(slow); //left side of the  linkedlist
    fast = head; //right side of the linkedlist
    int max = Integer.MIN_VALUE;
    while(slow!=null){
        max= Math.max(slow.data+fast.data ,max);
        fast = fast.next;
        slow = slow.next;
    }
    return max;
}
// Reverse the slow listnode 
public static LinkedList reverse(LinkedList root){
    if(root==null){
        return null;
    }
    LinkedList curr = root;
    LinkedList prev = null;
    while(curr!=null){
        LinkedList next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
}