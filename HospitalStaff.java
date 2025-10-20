class Staff {
    protected String name;
    protected int staffId;

    public Staff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    public void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId);
    }
}

class Doctor extends Staff {
    private String specialization;

    public Doctor(String name, int staffId, String specialization) {
        super(name, staffId);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Specialization=" + specialization);
    }
}

class Nurse extends Staff {
    private String shift;

    public Nurse(String name, int staffId, String shift) {
        super(name, staffId);
        this.shift = shift;
    }

    @Override
    public void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Shift=" + shift);
    }
}


public class HospitalStaff {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr. Reddy", 101, "Cardiology");
        Nurse nurse = new Nurse("Nisha", 102, "Night");

        doc.displayDetails();
        nurse.displayDetails();
    }
}
