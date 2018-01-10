package stack_and_queue;

import java.util.Stack;

/*
    实现一个特殊的栈，在栈基础功能外实现返回栈中最小元素的操作
    要求：
    1、pop push getMin 操作的时间复杂度都是O(1)
    2、设计的栈类型可以使用现成的栈结构
 */
public class getMinStack {
    public static void main(String[] args){
        Stack1 stack_getMin = new Stack1();
        stack_getMin.push(32);
        stack_getMin.push(98);
        stack_getMin.push(19);
        stack_getMin.push(67);

        System.out.println(stack_getMin.getMin());


    }
}

class Stack1 {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public Stack1() {
        this.dataStack = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }

    public void push(int num){
        if(this.minStack.isEmpty()){
            this.minStack.push(num);
        }else if (num <= this.getMin()){
            this.minStack.push(num);
        }else {
            this.minStack.push(this.getMin());
        }
        this.dataStack.push(num);

    }

    public int pop(){
        if(this.dataStack.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }
        int value = this.dataStack.pop();
        this.minStack.pop();
        return value;
    }

    public int getMin(){
        if(this.minStack.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }

        return this.minStack.peek();
    }
}

