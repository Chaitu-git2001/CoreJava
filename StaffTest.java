class Staff {
    protected String name;
    protected double salary;

    
    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println(name + " → " + salary);
    }
}


class TeachingStaff extends Staff {
    private String subject;

    public TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " → " + subject + ", " + salary);
    }
}


class NonTeachingStaff extends Staff {
    private String department;

    public NonTeachingStaff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " → " + department + ", " + salary);
    }
}


public class StaffTest {
    public static void main(String[] args) {
        
        TeachingStaff tStaff = new TeachingStaff("Anita", 50000, "Math");
        NonTeachingStaff ntStaff = new NonTeachingStaff("Ramesh", 40000, "Admin");

        
        tStaff.displayInfo();
        ntStaff.displayInfo();
    }
}
