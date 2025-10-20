import java.util.*;


class Employee {
    private String name;
    private double salary;

    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return name + ":" + salary;
    }
}

public class EmployeeSalarySorting {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Amit", 50000));
        employees.add(new Employee("Priya", 60000));
        employees.add(new Employee("Rohan", 45000));

        
        employees.sort(Comparator.comparingDouble(Employee::getSalary));

        
        System.out.print("Sorted by salary: ");
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i));
            if (i < employees.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
