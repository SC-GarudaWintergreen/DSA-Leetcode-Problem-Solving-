
class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode(-1);
        ListNode l1ptr = list1;
        ListNode l2ptr = list2;

        ListNode mptr = dummyHead;

        while (l1ptr != null && l2ptr != null) {
            if (l1ptr.val <= l2ptr.val) {
                mptr.next = l1ptr;
                l1ptr = l1ptr.next;

            } else {

                mptr.next = l2ptr;
                l2ptr = l2ptr.next;
            }
            mptr = mptr.next;
        }

        while (l1ptr != null) {
            mptr.next = l1ptr;
            l1ptr = l1ptr.next;
            mptr = mptr.next;

        }
        while (l2ptr != null) {

            mptr.next = l2ptr;
            l2ptr = l2ptr.next;
            mptr = mptr.next;
        }

        return dummyHead.next;

    }
}
