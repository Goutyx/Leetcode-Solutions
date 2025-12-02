class MyStack {
    Queue <Integer> q1;
    Queue <Integer> q2;

    public MyStack() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int removed = q1.remove();

        while(q2.size()>0){
            q1.add(q2.remove());
        }
        return removed;
        
    }
    
    public int top() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int peek = q1.peek();
        q2.add(q1.remove());

        while(q2.size()>0){
            q1.add(q2.remove());
        }
        return peek;
    }
    
    public boolean empty() {
        return q1.isEmpty();
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