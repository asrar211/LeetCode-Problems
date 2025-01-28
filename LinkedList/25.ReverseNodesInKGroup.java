class Solution {
    private ListNode findKthNode(ListNode temp, int k) {
        while (temp != null && k > 1) {
            temp = temp.next;
            k--;
        }
        return temp;
    }

    private ListNode reverse(ListNode head){

        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        
        ListNode temp = head;
        ListNode prevNode = null;

        while(temp != null){
            ListNode kthNode = findKthNode(temp, k);

            if(kthNode == null){
                if(prevNode != null){
                    prevNode.next = temp;
                break;
                }
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;

            reverse(temp);

            if(temp == head){
                head = kthNode;
            }else{
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
}