import java.util.*;

public class Main{
    public static void main(String[] args) {
        Queue messageQueue = new Queue();
        Stack messageStack = new Stack();
        Sender sender = new Sender(messageQueue);
        Receiver receiver = new Receiver(messageQueue, messageStack);

        Scanner input = new Scanner(System.in);

        while (true) {
            receiver.clearScreen();
            System.out.println("Welcome to the lucky gift!");
            System.out.println("1. Get lucky gift");
            System.out.println("2. Receive");
            System.out.println("3. History gift(Queue)");
            System.out.println("4. Print stack");
            System.out.println("5. Exit program");

            System.out.println("Please choose an option: ");
            int choice = input.nextInt();
            switch (choice){
                case 1: System.out.println("Sending ...");
                    sender.sendMessage();
                    break;
                case 2: System.out.println("Receiving ...");
                    receiver.receiveMessage();
                    break;
                case 3:
                    receiver.printQueue();
                    break;
                case 4: receiver.printStack();
                    break;
                case 5: System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again");
                    break;
            }
            System.out.println("Press Enter to continue...");
            input.nextLine();

            try {
                choice = input.nextInt();
            } catch (Exception e) {
                receiver.clearScreen();
                input.nextLine();
                System.out.println("Invalid choice. Please enter a number");
                System.out.println("Press Enter to continue...");
                input.nextLine();

                continue;
            }
            receiver.clearScreen();
        }
    }
}
