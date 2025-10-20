import java.util.*;

public class TicketBookingQueue {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();
        queue.add("Amit");
        queue.add("Priya");
        queue.add("Rohan");

        System.out.println("Initial Queue: " + queue);

        
        if (!queue.isEmpty()) {
            String serving = queue.poll(); // removes head of queue
            System.out.println("Serving: " + serving);
        }

        
        System.out.println("Queue: " + queue);
    }
}
