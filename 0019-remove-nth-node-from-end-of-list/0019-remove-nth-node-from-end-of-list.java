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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode ptr1 = head;
        ListNode ptr2 = head;

        while(ptr1 != null){
            count++;
            ptr1 = ptr1.next;
        }
        int x = count-n;

        if(n==count){
            return head.next;
        }

        for(int i=1;i<x;i++){
            ptr2 = ptr2.next;
        }
        ptr2.next = ptr2.next.next;
        return head;
    }
}