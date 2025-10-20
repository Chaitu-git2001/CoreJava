import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StudentList {

    static void loadStudentList(String filename) {
        try {
            FileReader fr = new FileReader(new File(filename)); // attempt to read file
            System.out.println("File loaded successfully");
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("Some other error occurred");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        loadStudentList(filename);
    }
}
