class Employee {
    // Instance variables
    private int id;
    private String name;
    private double basicSalary;

   
    private static int counter = 1001;

   
    public Employee() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    
    public Employee(String name, double basicSalary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

   
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

   
    public void displayDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Basic Salary: ₹" + basicSalary);
    }
}

public class EmployeeAutoIDGenerator {
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        Employee e2 = new Employee("Rohit", 35000);

        
        e1.displayDetails();
        e2.displayDetails();
    }
}
