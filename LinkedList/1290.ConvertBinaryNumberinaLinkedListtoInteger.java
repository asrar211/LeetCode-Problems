class Solution {
    public int getDecimalValue(ListNode head) {
        
        ListNode temp = head;
        int n =0;
         while (temp != null) {
            temp = temp.next;
            n++;
        }

        temp = head;
        int decimal= 0;
        for (int i = 0; i < n; i++) {
            decimal += temp.val * (int)Math.pow(2, n - i - 1);
            temp = temp.next;
        }
        return decimal;
    }
}