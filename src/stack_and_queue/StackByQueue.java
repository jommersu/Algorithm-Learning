package stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackByQueue {
    public static void main(String[] args){
        TwoQueueStack stack = new TwoQueueStack();
        int[] arr = {34,57,9,45,11,22};
        for (int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }
        stack.pop();
        System.out.println("the peek is :" + stack.peek());
    }
}

class TwoQueueStack {
    private Queue<Integer> queue;
    private Queue<Integer> help;

    public TwoQueueStack(){
        queue = new LinkedList<Integer>();
        help = new LinkedList<Integer>();
    }

    public void push(int num){
        queue.add(num);
    }

    public int pop(){
        if (queue.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }

        while (queue.size() != 1){
            help.add(queue.poll());
        }

        int res = queue.poll();
        swap();
        return res;
    }

    public int peek(){
        if (queue.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }

        while (queue.size() != 1){
            help.add(queue.poll());
        }

        int res = queue.poll();
        help.add(res);
        swap();
        return res;
    }

    public void swap(){
        Queue<Integer> tmp = help;
        help = queue;
        queue = tmp;
    }
}
