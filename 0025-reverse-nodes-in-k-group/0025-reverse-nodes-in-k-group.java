class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null) {
            return null;
        }

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        int count = 0;

        ListNode temp = head;

        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (count < k) {
            return head;
        }

        count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverseKGroup(curr, k);

        return prev;
    }
}