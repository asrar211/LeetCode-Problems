public public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode, Integer> mpp = Map<>();
        if(head == null){
            return null;
        }

        ListNode temp = head;
        while(temp != null){
            if(mpp.containsKey(temp)){
                return temp;
            }
            mpp.put(temp,1);
            temp =temp.next;
        }
        return null;
    }
} {
    
}
