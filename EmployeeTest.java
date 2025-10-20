class Employee {
    protected String name;
    protected double basicSalary;

    
    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    
    double getNetSalary() {
        return basicSalary;
    }
}


class RegularEmployee extends Employee {

    public RegularEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double getNetSalary() {
        double hra = 0.10 * basicSalary; // 10% HRA
        return basicSalary + hra;
    }
}


class ContractEmployee extends Employee {

    public ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double getNetSalary() {
        double allowance = 0.05 * basicSalary; // 5% Allowance
        return basicSalary + allowance;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Sample Input
        RegularEmployee emp1 = new RegularEmployee("Rahul", 20000);
        ContractEmployee emp2 = new ContractEmployee("Riya", 15000);

        // Sample Output
        System.out.println(emp1.name + " Net Salary = " + emp1.getNetSalary());
        System.out.println(emp2.name + " Net Salary = " + emp2.getNetSalary());
    }
}
