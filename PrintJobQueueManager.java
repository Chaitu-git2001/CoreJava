import java.util.*;

public class PrintJobQueueManager {
    public static void main(String[] args) {
        
        Queue<String> printQueue = new LinkedList<>();

        
        printQueue.add("Doc1");
        printQueue.add("Doc2");
        printQueue.add("Doc3");

        System.out.println("Initial Queue: " + printQueue);

        
        if (!printQueue.isEmpty()) {
            String currentJob = printQueue.poll();
            System.out.println("Printing " + currentJob);
        }

        
        System.out.print("Queue: ");
        Iterator<String> it = printQueue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) {
                System.out.print(", ");
            }
        }
    }
}
