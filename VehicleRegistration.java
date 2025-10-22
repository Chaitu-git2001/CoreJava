// Problem 18: Vehicle Registration – Static Counter
// C-DAC MUMBAI

class Vehicle {
    // Instance variables
    private String regNo;
    private String ownerName;
    private String vehicleType;

    // Static variable to count number of vehicles
    static int vehicleCount = 1;

    // Constructor to auto-generate registration number
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.regNo = "MH-2025-" + vehicleCount++;
    }

    // Getters
    public String getRegNo() {
        return regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Reg No: " + regNo + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        // Creating two vehicles
        Vehicle v1 = new Vehicle("Rohit", "Car");
        Vehicle v2 = new Vehicle("Priya", "Bike");

        // Displaying registration details
        v1.displayDetails();
        v2.displayDetails();
    }
}
