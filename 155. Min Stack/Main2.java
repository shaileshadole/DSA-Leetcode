//faltu solution, Used linked list to create the stack.
//There is a integer minNum who track the min till now. 
//But it will not work after the pop operation.

import java.util.Stack;

public class Main2 {

    static class MinStack {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Constructor
        public MinStack() {
        }

        public void push(int val) {

            if (stack2.isEmpty()) {
                stack2.push(val);
            } else {
                stack2.push(Math.min(val, stack2.peek()));
            }
            stack.push(val);
        }

        public void pop() {
            stack.pop();
            stack2.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return stack2.peek();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        MinStack obj = new MinStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
    }
}