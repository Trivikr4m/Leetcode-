class MyStack {
    Queue <Integer> q;
    int s;
    public MyStack() {
        q = new LinkedList<>();
        s=0;
    }
    
    public void push(int x) {
        s = q.size();
        q.add(x);

        for(int i = 0;i<s;i++){
            q.add(q.peek());
            q.remove();
        }
        s++;
    }
    
    public int pop() {
        s--;
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return s == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */