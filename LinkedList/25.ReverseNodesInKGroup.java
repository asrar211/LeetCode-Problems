class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode ptr = head;
        ListNode ktail = null;
        ListNode newHead = null;

        while (ptr != null) {
            int count = 0;
            ptr = head;

            while (count < k && ptr != null) {
                ptr = ptr.next;
                count++;
            }

            if (count == k) {
                ListNode revHead = reverseLinkedList(head, k);

                if (newHead == null) {
                    newHead = revHead;
                }

                if (ktail != null) {
                    ktail.next = revHead;
                }

                ktail = head;
                head = ptr;
            }
        }

        if (ktail != null) {
            ktail.next = head;
        }

        return newHead == null ? head : newHead;
    }

    private ListNode reverseLinkedList(ListNode head, int k) {
        ListNode prev = null;
        ListNode temp = head;

        while (k > 0) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            k--;
        }

        return prev;
    }
}
