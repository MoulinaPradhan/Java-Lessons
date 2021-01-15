package src.LinkedLists;

/**
 * 203. Remove Linked List Elements
Easy

2312

114

Add to List

Share
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 */
public class RemoveLinkedListElement {
   
     public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
         ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val== val){
            head=head.next;
        }
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.next.val == val){
             curr.next=curr.next.next;
       
        }else{
            curr=curr.next;
        }
        }
        return head;
    }
}
