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

    public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + 
                           ", Marks: " + marks + ", Grade: " + calculateGrade());
    }
}

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Riya", 85);
        Student s2 = new Student(102, "Amit", 55);

        s1.displayDetails();
        s2.displayDetails();
    }
}
