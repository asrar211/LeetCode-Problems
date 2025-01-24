//Iterative
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev= null;

        while(current != null){
            ListNode front = current.next;
            current.next = prev;
            prev= current;
            current= front;
        }
        return prev;
    }
}

//Recursive
class Solution{
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}