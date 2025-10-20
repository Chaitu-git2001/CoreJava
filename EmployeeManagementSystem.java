abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
}

interface BonusEligible {
    double calculateBonus();
}

class PermanentEmployee extends Employee implements BonusEligible {
    private double basicSalary;
    private double hra;

    public PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        // Bonus = 10% of salary
        return calculateSalary() * 0.10;
    }
}
class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        
        Employee e1 = new PermanentEmployee("Amit", 101, 50000, 5000);
        Employee e2 = new PermanentEmployee("Ravi", 102, 40000, 4000);
        Employee e3 = new ContractEmployee("Neha", 201, 300, 100);
        Employee e4 = new ContractEmployee("Suresh", 202, 250, 120);

        
        Employee[] employees = {e1, e2, e3, e4};

        
        for (Employee e : employees) {
            double salary = e.calculateSalary();
            System.out.print(e.name + " Salary = " + salary);

            
            if (e instanceof BonusEligible) {
                BonusEligible b = (BonusEligible) e;
                System.out.println(", Bonus = " + b.calculateBonus());
            } else {
                System.out.println();
            }
        }
    }
}
