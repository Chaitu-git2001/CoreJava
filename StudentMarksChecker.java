class Student {
    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentMarksChecker {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Riya", 75);

        System.out.println("Before updating marks:");
        s1.displayDetails();

        s1.setMarks(85);

        System.out.println("After updating marks:");
        s1.displayDetails();
    }
}
