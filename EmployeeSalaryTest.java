// Superclass
class Employee {
    protected String name;
    protected int salary;

    // Constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display salary (can be overridden)
    void displaySalary() {
        System.out.println(name + " Total Salary = " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        int totalSalary = salary + (int)(0.20 * salary);
        System.out.println(name + " Total Salary = " + totalSalary);
    }
}

// Subclass: Developer
class Developer extends Employee {
    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        int totalSalary = salary + (int)(0.10 * salary);
        System.out.println(name + " Total Salary = " + totalSalary);
    }
}

// Main class
public class EmployeeSalaryTest {
    public static void main(String[] args) {
        // Sample Input
        Employee manager = new Manager("Anita", 50000);
        Employee developer = new Developer("Rohit", 40000);

        // Sample Output
        manager.displaySalary();
        developer.displaySalary();
    }
}
