//faltu solution, Used linked list to create the stack.
//There is a integer minNum who track the min till now. 
//But it will not work after the pop operation.


public class Main {
    
    static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    
    static class MinStack {

        Node top = null;
        int minNum = Integer.MAX_VALUE;

        //Constructor
        public MinStack() {
            
        }

        public void push(int val) {
            minNum = Math.min(minNum, val);
            Node gendo = new Node(val);
            gendo.next = top;
            top = gendo;
        }

        public void pop() {
            top = top.next;
            minNum = Math.min(minNum, val);
        }

        public int top() {
            return top.val;
        }

        public int getMin() {
            return minNum;
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