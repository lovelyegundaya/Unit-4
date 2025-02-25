public class ArrayQueue {
    int[] queue;
    int size;   //counter for added elements to the queue
    int capacity;
    public ArrayQueue(int capacity){
        this.queue = new int[capacity]; // declares the array queue with its capacity
        this.size = 0;
        this.capacity = capacity;
    }
    public void enqueue(int data){
        if(isFull()){
            throw new IllegalStateException("Queue is full.");
        }
        queue[size++] = data;
    }
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty.");
        }
        int value = queue[0];
        for(int i = 1; i <= size; i++){
            queue[i-1] = queue[i];
        }
        return value;
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty.");
        }
        return queue[0];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public void traverse(){
        System.out.print("[ ");
        for(int i = 0; i < size - 1 ; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println("]");
    }
}
