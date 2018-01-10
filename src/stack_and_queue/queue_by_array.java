package stack_and_queue;

public class queue_by_array {
    public static void main(String[] args){
        Queue queue = new Queue(8);

        for(int i = 1; i < 6; i++){
            queue.push(i);
        }
        queue.PrintQueue();

        for(int i = 0; i < 3; i++){
            System.out.println(queue.poll());
        }

        queue.PrintQueue();
        System.out.println("the peek of the queue is : " + queue.peek());
    }
}

class Queue {
    private int[] arr;
    private int size;
    private int start;
    private int end;

    public Queue(int initSize){
        if(initSize < 0){
            throw new IllegalArgumentException("the init size is less than 0");
        }

        arr = new int[initSize];
        size = 0;
    }

    public void push(int num){
        if(size == arr.length){
            throw new ArrayIndexOutOfBoundsException("the queue is full");
        }

        size++;
        arr[end] = num;
        end = end == arr.length -1 ? 0 : end + 1;
    }

    public int poll(){
        if(size == 0){
            throw new ArrayIndexOutOfBoundsException("the queue is empty");
        }

        size--;
        int tmp = start;
        start = start == arr.length - 1 ? 0 : start + 1;
        return arr[tmp];
    }

    public int peek(){
        if(size == 0){
            throw new ArrayIndexOutOfBoundsException("the queue is empty");
        }

        return arr[start];
    }

    public void PrintQueue(){
        System.out.println("the queue is :");

        for(int i = start; i < end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
