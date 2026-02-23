class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {

            // If duplicate found
            if (current.next != null && current.val == current.next.val) {

                // Skip all nodes with same value
                while (current.next != null && current.val == current.next.val) {
                    current = current.next;
                }

                // Remove all duplicates
                prev.next = current.next;

            } else {
                // Move prev only if no duplicate
                prev = prev.next;
            }

            current = current.next;
        }

        return dummy.next;
    }
}