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
        if (head == null) return head;

        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        if (n == length) {
            head = head.next;
            return head;
        }

        int index = length - n;
        ListNode start = head;
        for (int i=0;i< index-1;i++) {
            start = start.next;
        }

        start.next = start.next.next;

        return head;
    }
}