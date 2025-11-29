/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode fast=head;
        ListNode slow=head;

        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode current=slow.next;
        slow.next=null;
        ListNode prev=null;

        while(current != null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        ListNode first=head;
        ListNode second=prev;

        while(second != null){
            ListNode temp = first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp;

            first=temp;
            second=temp2;
        }
    }
}