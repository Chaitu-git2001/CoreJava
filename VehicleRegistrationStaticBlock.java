class Vehicle {
    private String regNo;
    private String ownerName;
    private String vehicleType;

    static int vehicleCount = 1;

    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.regNo = "MH-2025-" + vehicleCount++;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void displayDetails() {
        System.out.println("Reg No: " + regNo + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }
}

public class VehicleRegistrationStaticBlock {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rohit", "Car");
        Vehicle v2 = new Vehicle("Priya", "Bike");
        Vehicle v3 = new Vehicle("Amit", "Truck");

        v1.displayDetails();
        v2.displayDetails();
        v3.displayDetails();
    }
}
