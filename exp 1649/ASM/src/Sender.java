import javax.annotation.processing.Messager;
import javax.swing.*;
import java.util.Random;

public class Sender {
    private Queue messageQueue;
    private String[] loremIpsum = {
            "Wish you luck next time",
            "congrats you get 20.000 vnd",
            "congrats you get 50.000 vnd",
            "congrats you get 100.000 vnds"
    };

    public Sender(Queue queue){
        messageQueue = queue;
    }

    public void sendMessage() {
        Random rand = new Random();
        String message = loremIpsum[rand.nextInt(loremIpsum.length)];
        System.out.println("Message sent: " + message);
        messageQueue.enqueue(message);
    }
}
