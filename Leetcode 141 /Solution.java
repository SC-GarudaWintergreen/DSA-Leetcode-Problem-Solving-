
public class Solution {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            while (slow == fast) {
                return true;
            }
        }

        return false;

    }
}
