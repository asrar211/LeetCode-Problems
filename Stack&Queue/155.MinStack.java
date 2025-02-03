class MinStack {
    private Stack<Long> st;
    private long min;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if (st.isEmpty()) {
            min = val;
            st.push((long) val);
        } else {
            if (val >= min) {
                st.push((long) val);
            } else {
                st.push(2L * val - min); 
                min = val;
            }
        }
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        long x = st.pop();
        if (x < min) {
            min = 2 * min - x; 
        }
        if (st.isEmpty()) min = 0; 
    }
    
    public int top() {
        if (st.isEmpty()) return -1; 
        long x = st.peek();
        return (x < min) ? (int) min : (int) x; 
    }
    
    public int getMin() {
        if (st.isEmpty()) return -1; 
        return (int) min;
    }
}