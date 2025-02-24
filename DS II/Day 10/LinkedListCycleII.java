/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp!=fast);

                break;
            }
        }

        if (length == 0) return null;

        ListNode s = head;
        ListNode f = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        while (f != s) {
            s = s.next;
            f = f.next;
        }

        return s;
    }
}