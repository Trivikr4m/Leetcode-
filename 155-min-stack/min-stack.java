class MinStack {
    Stack <Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }
    
    public void push(int value) {
        long val = value;
        if(st.isEmpty()){
            st.push(val);
            min = val;
        } else{
            if(val < min){
                st.push(2*val - min);
                min = val;
            }else{
                st.push(val);
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        long n = st.peek();
        st.pop();
        if(n < min) min = (2*min - n); 
    }
    
    public int top() {
        if(st.isEmpty()) return 0;
        long m = st.peek();
        if(m < min) return (int)min;
        return (int)m;
    }
    
    public int getMin() {
        if(st.isEmpty()) return 0;
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */