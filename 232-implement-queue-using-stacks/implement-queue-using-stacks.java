class MyQueue {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> supportStack = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        mainStack.push(x);
    }
    
    public int pop() {
        int val = -1;
        while(!mainStack.isEmpty()){
            supportStack.push(mainStack.pop());
        }

        if(!supportStack.isEmpty())
            val = supportStack.pop();

        while(!supportStack.isEmpty()){
            mainStack.push(supportStack.pop());
        }
        return val;
    }
    
    public int peek() {
        int val = -1;
        while(!mainStack.isEmpty()){
            supportStack.push(mainStack.pop());
        }
        
        if(!supportStack.isEmpty())
            val = supportStack.peek();

        while(!supportStack.isEmpty()){
            mainStack.push(supportStack.pop());
        }
        return val;
    }
    
    public boolean empty() {
        return mainStack.isEmpty();
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