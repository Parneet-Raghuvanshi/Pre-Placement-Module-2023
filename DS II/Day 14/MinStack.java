class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (min.size() == 0 || val <= min.peek()) min.push(val);
    }

    public void pop() {
        if (stack.size()==0) return;
        int ans = stack.peek();
        stack.pop();
        if (min.peek() == ans) min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if (min.size()==0) return -1;
        else return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */