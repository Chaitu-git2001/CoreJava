import java.util.*;

public class CommandHistoryTracker {
    public static void main(String[] args) {
        
        int limit = 3;

        
        Queue<String> history = new LinkedList<>();

        String[] commands = {"ls", "pwd", "cd ..", "mkdir"};

        for (String cmd : commands) {
            
            if (history.size() == limit) {
                history.poll(); 
            }
            history.add(cmd);
        }

        
        System.out.print("Recent Commands: ");
        Iterator<String> it = history.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) {
                System.out.print(", ");
            }
        }
    }
}
