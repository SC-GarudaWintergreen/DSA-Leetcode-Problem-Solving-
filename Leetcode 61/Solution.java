
public class Solution {

    public int sizeOfLL(ListNode head) {
        ListNode ptr = head;
        int size = 0;

        while (ptr != null) {
            size++;
            ptr = ptr.next;
        }

        return size;
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        int sizeOfList = sizeOfLL(head);

        k = k % sizeOfList;

        if (k == 0) {
            return head;
        }

        ListNode pivot = head;

        for (int i = 1; i < sizeOfList - k; i++) {

            pivot = pivot.next;

        }

        ListNode newHead = pivot.next;
        pivot.next = null;

        ListNode ptr = newHead;
        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = head;

        return newHead;

    }
}
