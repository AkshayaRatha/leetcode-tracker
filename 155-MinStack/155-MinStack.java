// Last updated: 7/9/2026, 9:15:44 AM
class MinStack {
    Stack<Integer> main;
    Stack<Integer> min;
    public MinStack() {
        main=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int value) {
        main.push(value);
        if(min.isEmpty()) min.push(value);
        else min.push(Math.min(value,min.peek()));
    }
    
    public void pop() {
        main.pop();
        min.pop();
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}