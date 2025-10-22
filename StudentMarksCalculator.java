class Student {
    // Instance variables
    private String name;
    private int marks;

    // Static variable to track total students
    private static int totalStudents = 0;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        totalStudents++;  // increment when a new student is created
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to check if student passed
    public boolean isPassed() {
        return marks >= 35;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Static method to show total students
    public static void showTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }
}

public class StudentMarksCalculator {
    public static void main(String[] args) {
        // Creating students
        Student s1 = new Student("Rahul", 78);
        Student s2 = new Student("Pooja", 34);
        Student s3 = new Student("Amit", 65);

        // Checking pass/fail
        System.out.println("Student " + s1.getName() + " Passed? " + s1.isPassed());
        System.out.println("Student " + s2.getName() + " Passed? " + s2.isPassed());
        System.out.println("Student " + s3.getName() + " Passed? " + s3.isPassed());

        // Showing total students
        Student.showTotalStudents();
    }
}
