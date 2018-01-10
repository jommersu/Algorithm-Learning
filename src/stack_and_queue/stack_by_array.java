package stack_and_queue;

/*********用数组实现栈结构***********/
public class stack_by_array {
    public static void main(String[] args){
        System.out.println("enter the length of stack");
        //Scanner input = new Scanner(System.in);
        //int length = input.nextInt();
        stack_array stack = new stack_array(8);

        for(int i = 0; i < 5; i++){
            stack.push(i);
        }

        for(int i = 0; i < 3; i++){
            System.out.println(stack.pop());
        }

        System.out.println(stack.peek());

    }


}

class stack_array{
    private int[] arr;
    private int size;

    public stack_array(int initSize){
        if(initSize < 0){
            throw new IllegalArgumentException("the init size is less than 0");
        }
        arr = new int[initSize];
        size = 0;
    }

    public void push(int num){
        if(size == arr.length){
            throw new ArrayIndexOutOfBoundsException("the stack is full");
        }
        arr[size++] = num;
    }

    public int pop(){
        if(size == 0){
            throw new ArrayIndexOutOfBoundsException("the stack is empty");
        }
        return arr[--size];
    }

    public int peek(){
        if(size == 0){
            throw new ArrayIndexOutOfBoundsException("the stack is empty");
        }
        return arr[size - 1];
    }


}
