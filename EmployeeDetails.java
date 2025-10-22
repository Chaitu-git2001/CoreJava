class Employee {
    // Instance variables
    private String name;
    private double salary;
    private int yearsOfService;

    // Static variable to track total employees
    private static int totalEmployees = 0;

    // Constructor
    public Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        totalEmployees++; // Increment whenever a new employee is created
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    // Method to calculate bonus
    public double calculateBonus() {
        if (yearsOfService > 5) {
            return 0.05 * salary;  // 5% of salary
        } else {
            return 0.0;
        }
    }

    // Static method to show total employees
    public static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        // Creating employees
        Employee emp1 = new Employee("Ravi", 150000, 6);
        Employee emp2 = new Employee("Anita", 120000, 3);
        Employee emp3 = new Employee("Suresh", 100000, 5);

        // Printing bonuses
        System.out.println("Employee " + emp1.getName() + " Bonus: " + emp1.calculateBonus());
        System.out.println("Employee " + emp2.getName() + " Bonus: " + emp2.calculateBonus());
        System.out.println("Employee " + emp3.getName() + " Bonus: " + emp3.calculateBonus());

        // Printing total employees
        Employee.showTotalEmployees();
    }
}
