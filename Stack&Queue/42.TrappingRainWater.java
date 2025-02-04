import java.util.Stack;

class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        
        Stack<Integer> st = new Stack<>();
        int totalWater = 0;
        int n = height.length;
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && height[i] > height[st.peek()]) {
                int bottom = st.pop();  
                
                if (st.isEmpty()) break; 
                
                int leftBoundary = st.peek(); 
                int width = i - leftBoundary - 1; 
                int heightDiff = Math.min(height[leftBoundary], height[i]) - height[bottom]; 
                
                totalWater += width * heightDiff;
            }
            st.push(i); 
        }
        return totalWater;
    }
}
