public class Solution {
    public static Node reverseDLL(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node current = head;

        while (current != null) {
            prev = current.prev;
            current.prev = current.next;
            current.next = prev;
            current = current.prev;
        }
        return prev.prev;
    }
}