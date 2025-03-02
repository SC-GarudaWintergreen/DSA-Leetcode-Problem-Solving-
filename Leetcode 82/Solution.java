
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        Map<Integer, Integer> freqMap = new TreeMap<>();

        ListNode temp = head;

        while (temp != null) {

            int occurance = freqMap.getOrDefault(temp.val, 0);
            freqMap.put(temp.val, occurance + 1);

            temp = temp.next;
        }

        ListNode dummyHead = new ListNode(-1);
        ListNode ptr = dummyHead;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {

            if (entry.getValue() == 1) {

                ptr.next = new ListNode(entry.getKey());
                ptr = ptr.next;
            }

        }

        return dummyHead.next;
    }
}
