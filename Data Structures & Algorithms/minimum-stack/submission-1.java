class MinStack {
   
    private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public MinStack() {
       stack = new Stack<>();
       minstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || val<=minstack.peek()) minstack.push(val);
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int p = stack.pop();
        if(minstack.peek()==p) minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
