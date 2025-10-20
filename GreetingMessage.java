import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String initialText = sc.nextLine();     
        String textToInsert = sc.nextLine();     
        int insertIndex = sc.nextInt();          
        sc.nextLine(); 
        String textToAppend = sc.nextLine();    

        
        StringBuilder sb = new StringBuilder(initialText);
        sb.insert(insertIndex, " " + textToInsert); 
        sb.append(" " + textToAppend);              

        
        System.out.println(sb.toString());
    }
}
