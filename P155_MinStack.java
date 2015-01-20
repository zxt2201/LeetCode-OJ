
public class P155_MinStack{
	Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    
    public P155_MinStack(){
        minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        stack.push(x);
        if(x<=minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        int c = stack.pop();
        if(minStack.peek()==c)
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
