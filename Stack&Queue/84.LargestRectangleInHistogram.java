class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea =0;
        int nse, pse, el =0;
        int n = heights.length;

        for(int i=0; i<= n-1; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                el = st.peek();
                st.pop();

                nse = i;
                pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, (heights[el] *(nse - pse -1)));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nse = n;
            el = st.peek();
            st.pop();

            pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, (heights[el] * (nse - pse -1)));
        }
        return maxArea;
    }
}