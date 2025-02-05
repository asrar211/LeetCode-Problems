class Solution {
    private int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

    private int[] findPSEE(int[] arr) {
        int n = arr.length;
        int[] psee = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            psee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int total = 0;
        int mod = (int) (1e9 + 7);
        
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);

        for (int i = 0; i < n; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            total = (int) ((total + ((long) right * left % mod * arr[i]) % mod) % mod);
        }
        return total;
    }
}