

public class App {
    public static void main(String[] args) throws Exception {

        LinkedListStack lls = new LinkedListStack();
        lls.push(1); // 1 -> null
        lls.push(2); // 2 -> 1 -> null
        System.out.println(lls.pop() + " has been popped out!");
        System.out.println(lls.peek() + " is the topmost node in the stack.");
        lls.traverse(); //print the contents of linked list stack
        
        ArrayQueue aq = new ArrayQueue(5);
        aq.enqueue(1); //[ 1 ]
        aq.enqueue(2); //[ 1 2 ]
        aq.enqueue(3); //[ 1 2 3 ]
        System.out.println(aq.dequeue() + " has been dequeued"); // [ 2 3 ]
        aq.traverse(); //print the elements of the Array Queue
        System.out.println(aq.peek() + " is the front element.");

        LinkedListQueue llq = new LinkedListQueue();
        llq.enqueue(1); // 1 -> null
        llq.enqueue(2); // 1 -> 2 -> null
        llq.enqueue(3); // 1 -> 2 -> 3 -> null
        System.out.println(llq.dequeue() + " has been dequeued"); // 2 -> 3 -> null
        System.out.println(llq.peek() + " is the front element"); // prints front element
        llq.traverse();
    }
}


