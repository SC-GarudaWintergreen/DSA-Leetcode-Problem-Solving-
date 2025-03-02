
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

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode ptr = dummyHead;
        int size = sizeOfLL(head);

        for (int i = 0; i < size - n; i++) {
            ptr = ptr.next;
        }

        ptr.next = ptr.next.next;

        return dummyHead.next;

    }
}
