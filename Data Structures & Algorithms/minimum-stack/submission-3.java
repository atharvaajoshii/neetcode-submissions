class MinStack {
    int top;
    ArrayList<Integer> stack,minstack;
    public MinStack() {
        stack = new ArrayList<>();
        minstack = new ArrayList<>();
        this.top=-1;
    }
    
    public void push(int val) {
    stack.add(val);

    if (minstack.isEmpty()) {
        minstack.add(val);
    } else {
        int currentMin = minstack.get(minstack.size() - 1);
        minstack.add(Math.min(val, currentMin));
    }
    }
    
    public void pop() {
    stack.remove(stack.size() - 1);
    minstack.remove(minstack.size() - 1);
    }
    
    public int top() {
        int a = stack.get(stack.size()-1);
        return a;
    }
    
    public int getMin() {
    return minstack.get(minstack.size() - 1);
    }
}
