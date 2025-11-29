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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }

        ListNode mid= midNode(head);
        ListNode right=mid.next;
        mid.next=null;
        ListNode left=head;

        left=sortList(left);
        right=sortList(right);

        ListNode merge = mergeList(left, right);
        return merge;
    }

    public ListNode midNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode mergeList(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(list1 != null && list2 != null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
            }else{
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }
        if(list1 != null){
            tail.next=list1;
        }else{
            tail.next=list2;
        }
        return dummy.next;
    }
}