import java.util.*;

public class TextEditorUndoSystem {
    public static void main(String[] args) {
        
        Stack<String> actions = new Stack<>();

        
        actions.push("Type A");
        actions.push("Type B");
        actions.push("Delete");

        System.out.println("Initial Actions: " + actions);

        
        if (!actions.isEmpty()) {
            String undone = actions.pop();
            System.out.println("Undo Operation: Removed -> " + undone);
        }

        
        System.out.print("Current actions: ");
        for (int i = 0; i < actions.size(); i++) {
            System.out.print(actions.get(i));
            if (i < actions.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
