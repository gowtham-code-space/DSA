class MinStack {
    Stack<Integer> stack;
    Stack<Integer> mini;
    public MinStack() {
        stack = new Stack<>();
        mini = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(mini.isEmpty()) mini.push(value);
        else{
            int curr = mini.peek();
            mini.push(Math.min(curr, value));
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
            mini.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()) return stack.peek();
        else return -1;
    }
    
    public int getMin() {
        if(!mini.isEmpty()) return mini.peek();
        return -1;
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