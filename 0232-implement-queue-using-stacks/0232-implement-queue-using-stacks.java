class MyQueue {
    Stack <Integer> stack = new Stack<>();
    Stack <Integer> second = new Stack<>();

    public MyQueue() {
        this.stack= new Stack<>();
        this.second= new Stack<>();        
    }
    
    public void push(int x) {
        stack.push(x);
        
    }
    
    public int pop() {
        while(!stack.isEmpty()){
            second.push(stack.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            stack.push(second.pop());
        }
        return removed;
    }
    
    public int peek() {
        while(!stack.isEmpty()){
            second.push(stack.pop());
        }
        int peek = second.peek();
        while(!second.isEmpty()){
            stack.push(second.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */