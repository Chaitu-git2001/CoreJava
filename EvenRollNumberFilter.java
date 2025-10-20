import java.util.*;

public class EvenRollNumberFilter {
    public static void main(String[] args) {
        
        List<Integer> rollNumbers = new ArrayList<>(Arrays.asList(101, 102, 103, 104));

        
        Iterator<Integer> iterator = rollNumbers.iterator();
        while (iterator.hasNext()) {
            int roll = iterator.next();
            if (roll % 2 != 0) {
                iterator.remove();
            }
        }

        
        System.out.print("Even Roll Numbers: ");
        for (int i = 0; i < rollNumbers.size(); i++) {
            System.out.print(rollNumbers.get(i));
            if (i < rollNumbers.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
