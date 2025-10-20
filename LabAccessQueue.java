import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LabAccessQueue {
    public static void main(String[] args) {
        Queue<String> labQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students to enqueue: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            labQueue.add(name);
        }

        
        System.out.println("Queue: " + labQueue);

        System.out.print("Enter number of students to dequeue: ");
        int d = sc.nextInt();

        for (int i = 0; i < d && !labQueue.isEmpty(); i++) {
            String removed = labQueue.poll();
            System.out.println("Student processed: " + removed);
        }

        System.out.println("Remaining Queue: " + labQueue);

        sc.close();
    }
}
