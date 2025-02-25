public class LinkedListQueue {
    Node front, rear;
    public void enqueue(int data){
        Node newNode = new Node(data); // preparation 
        if(rear != null){
            rear.next = newNode; // adds newNode after the rear nodes
        }
        rear = newNode; //assigning the new rear
        if(isEmpty()){
            front = newNode; 
        }
    }
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        int value = front.data; // 1 -> 2 -> 3 -> null, value = 1
        front = front.next; //front = 2 
        if(isEmpty()){
            rear = null;
        }
        return value;
    }
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty.");
        }
        return front.data;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void traverse(){
        while(front != null){
            System.out.print(front.data + " -> ");
            front = front.next;
        }
        System.out.println("null");
    }
}
