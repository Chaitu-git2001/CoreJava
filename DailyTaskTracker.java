import java.util.ArrayList;
import java.util.Scanner;

public class DailyTaskTracker {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tasks to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter task: ");
            String task = sc.nextLine();
            tasks.add(task);
        }

        System.out.println("Tasks: " + tasks);

   
        System.out.print("Enter task to mark as completed: ");
        String completedTask = sc.nextLine();

        if (tasks.remove(completedTask)) {
            System.out.println("Task '" + completedTask + "' completed and removed.");
        } else {
            System.out.println("Task not found!");
        }

    
        System.out.println("Remaining tasks: " + tasks);

        sc.close();
    }
}
