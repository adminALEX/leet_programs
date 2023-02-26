class MyStack {
    List<Integer> l;
    int latest = -1;
    public MyStack() {
         l = new ArrayList<>();
    }
    
    public void push(int x) {
        l.add(x);
        latest++;
    }
    
    public int pop() {
        
        int n = l.get(latest);
        l.remove(latest);
        latest--;
        return n;
    }
    
    public int top() {
        if(!l.isEmpty())
            return l.get(latest);
        else
            return -1;
    }
    
    public boolean empty() {
        return l.isEmpty();
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