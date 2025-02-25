public class LinkedListStack {
    Node top;
    public void push(int data){
        Node newNode = new Node(data); //preparation of data to be added to the Linked list stack
        newNode.next = top; 
        top = newNode;
    }   
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    public int peek(){
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void traverse(){

        // Linked List
        // 2 -> 1 -> null
        while(top != null){
            System.out.print(top.data + " -> ");
            top = top.next;
        }
        System.out.println("null");
    }
}
