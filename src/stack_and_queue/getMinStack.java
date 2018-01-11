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
        Stack2 stack_getMin = new Stack2();
        int[] arr = generateArr();
//        int[] arr = {12,34,56,11,7,65};
        for(int i = 0; i <arr.length; i++ ){
            System.out.println("now push : " + arr[i]);
            stack_getMin.push(arr[i]);
        }

        for(int i = arr.length - 1; i > 4; i--){
            System.out.println("now pop : " + arr[i]);
            stack_getMin.pop();
        }

        System.out.println("now the min number is : ");

        System.out.println(stack_getMin.getMin());

    }

    public static int[] generateArr(){
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = (int)(50 * Math.random() + 2);
        }

        return arr;
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

class Stack2 {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public Stack2(){
        this.dataStack = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }

    public void push(int num){

        if(this.minStack.isEmpty()){
            this.minStack.push(num);
        }else if (num <= this.minStack.peek()){
            this.minStack.push(num);
        }

        this.dataStack.push(num);
    }

    public int pop(){
        if(this.dataStack.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }

        int value = this.dataStack.pop();
        if(value <= this.minStack.peek()){
            this.minStack.pop();
        }
        return value;
    }

    public int getMin(){
        if(this.minStack.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }

        return this.minStack.peek();
    }


}



