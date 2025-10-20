abstract class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    abstract int calculateBonus();
}

class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    int calculateBonus() {
        return (int)(0.20 * salary); 
    }
}


class Developer extends Employee {
    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    int calculateBonus() {
        return (int)(0.10 * salary); // 10% of salary
    }
}


public class EmployeeBonusTest {
    public static void main(String[] args) {
        
        Employee manager = new Manager("Anita", 50000);
        Employee developer = new Developer("Rohit", 40000);

        System.out.println(manager.name + " Bonus = " + manager.calculateBonus());
        System.out.println(developer.name + " Bonus = " + developer.calculateBonus());
    }
}
