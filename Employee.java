class Employee {
    
    private int age;

    
    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    
    public int getAge() {
        return age;
    }

    
    public static void main(String[] args) {
        Employee emp = new Employee();

        
        emp.setAge(17);  // invalid case
        System.out.println("Age = " + emp.getAge());

        emp.setAge(25);  // valid case
        System.out.println("Age = " + emp.getAge());
    }
}
