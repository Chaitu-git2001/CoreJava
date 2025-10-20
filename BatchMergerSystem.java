import java.util.*;

public class BatchMergerSystem {
    public static void main(String[] args) {
        
        List<String> morningBatch = Arrays.asList("Amit", "Priya");

        
        List<String> eveningBatch = Arrays.asList("Rohan", "Priya");

        
        Set<String> mergedBatch = new LinkedHashSet<>();
        mergedBatch.addAll(morningBatch);
        mergedBatch.addAll(eveningBatch);

        
        
        System.out.println("Combined batches: " + String.join(", ", mergedBatch));
    }
}
