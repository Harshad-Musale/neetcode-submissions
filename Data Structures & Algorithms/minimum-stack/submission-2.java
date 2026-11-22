class MinStack {
         Stack<Integer> stack;
         Stack<Integer> minst;
    public MinStack() {
      stack=new Stack();
      minst=new Stack();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minst.isEmpty() || minst.peek()>=val){
            minst.push(val);
        }
    }
    
    public void pop() {
        if(stack.pop().equals(minst.peek())){
            minst.pop();
        }
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}
