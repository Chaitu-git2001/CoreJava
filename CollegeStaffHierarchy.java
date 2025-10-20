class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println(name + " → Salary=" + salary);
    }
}
class TeachingStaff extends Employee {
    protected String subject;

    public TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    public void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Salary=" + salary);
    }
}


class Professor extends TeachingStaff {
    private String specialization;

    public Professor(String name, double salary, String subject, String specialization) {
        super(name, salary, subject);
        this.specialization = specialization;
    }

    @Override
    public void displaySalary() {
        System.out.println(name + " → Subject=" + subject + 
                           ", Specialization=" + specialization + 
                           ", Salary=" + salary);
    }
}


class Lecturer extends TeachingStaff {
    private String department;

    public Lecturer(String name, double salary, String subject, String department) {
        super(name, salary, subject);
        this.department = department;
    }

    @Override
    public void displaySalary() {
        System.out.println(name + " → Subject=" + subject + 
                           ", Department=" + department + 
                           ", Salary=" + salary);
    }
}


public class CollegeStaffHierarchy {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Sharma", 80000, "Math", "Algebra");
        Lecturer lec = new Lecturer("Ms. Mehta", 50000, "Physics", "Science");

        prof.displaySalary();
        lec.displaySalary();
    }
}
