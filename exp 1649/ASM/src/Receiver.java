public class Receiver {
    private Queue messageQueue;
    private Stack messageStack;

    public Receiver(Queue queue, Stack stack){
        messageQueue = queue;
        messageStack = stack;
    }

    public void receiveMessage() {
        if (messageQueue.isEmpty()) {
            System.out.println("Error: Message queue is empty");
            return;
        }
        String message = messageQueue.dequeue();
        System.out.println("Received message: " + message);
        messageStack.push(message);
    }

    public void printStack() {
        if (messageStack.isEmpty()){
            System.out.println("Error: Message stack is empty");
            return;
        }
        System.out.println("Message stack: ");
        messageStack.printStack();
    }

    public void printQueue() {
        if (messageQueue.isEmpty()){
            System.out.println("Error: Message queue is empty");
            return;
        }
        System.out.println("Message queue: ");
        messageQueue.printQueue();
    }

    public void clearScreen() {
        System.out.println("\033[H\033[23");
        System.out.flush();
    }
}
