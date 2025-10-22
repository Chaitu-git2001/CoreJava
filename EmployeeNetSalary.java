class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private static int counter = 1001;

    
    public Employee(String name, double basicSalary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    
    public double calculateNetSalary() {
        double hra = 0.10 * basicSalary;  // 10% HRA
        double da = 0.05 * basicSalary;   // 5% DA
        double pf = 0.02 * basicSalary;   // 2% PF
        return basicSalary + hra + da - pf;
    }

    
    public void displayDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + 
                           ", Basic Salary: ₹" + basicSalary + 
                           ", Net Salary: ₹" + calculateNetSalary());
    }
}

public class EmployeeNetSalary {
    public static void main(String[] args) {
        Employee e1 = new Employee("Riya", 30000);
        Employee e2 = new Employee("Amit", 45000);

        e1.displayDetails();
        e2.displayDetails();
    }
}
