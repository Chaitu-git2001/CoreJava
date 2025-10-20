import java.util.Scanner;

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    // finalize method called by Garbage Collector
    @Override
    protected void finalize() {
        System.out.println("Student object for " + name + " is being garbage collected");
    }
}

public class StudentObjectCleanup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentName = sc.nextLine();  // Amit

        // Create student object
        Student s1 = new Student(studentName);

        // Make object eligible for GC
        s1 = null;

        // Suggest JVM to run Garbage Collector
        System.gc();

        // Pause to let GC finish
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }
}
