class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int len =1;
        ListNode tail = head;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }

        k= k % len;
        if( k == 0) return head;
        tail.next = head;

        ListNode temp =head;
        for(int i=1; i< len - k; i++){
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;

        return newHead;
    }
}