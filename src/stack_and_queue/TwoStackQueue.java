package stack_and_queue;

import java.util.Stack;

public class TwoStackQueue {
    public static void main(String[] args){
        QueueByStack queue = new QueueByStack();
        int[] arr = {34,57,9,45,11,22};
        for (int i = 0; i < arr.length; i++){
            queue.push(arr[i]);
        }
            queue.pop();

        System.out.println("the peek is :" + queue.peek());
    }
}

class QueueByStack {
    private Stack<Integer> pushStack;
    private Stack<Integer> pollStack;

    public QueueByStack(){
        this.pushStack = new Stack<Integer>();
        this.pollStack = new Stack<Integer>();
    }

    public void push(int num){
        this.pushStack.push(num);
    }

    public int pop(){
        if (this.pollStack.isEmpty() && this.pushStack.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }else if (this.pollStack.isEmpty()){
            while (!this.pushStack.isEmpty()){
                this.pollStack.push(this.pushStack.pop());
            }
        }

        return this.pollStack.pop();
    }

    public int peek(){
        if (this.pollStack.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }
        return this.pollStack.peek();
    }
}
