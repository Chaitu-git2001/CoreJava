class Mobile {
    // Instance variable
    private String model;

    // Static variable to count total mobiles
    private static int totalMobiles = 0;

    // Constructor
    public Mobile(String model) {
        this.model = model;
        totalMobiles++;  // Increment whenever a new mobile is added
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Static method to show total mobiles
    public static void showTotalMobiles() {
        System.out.println("Total mobiles in stock: " + totalMobiles);
    }
}

public class MobileHistory {
    public static void main(String[] args) {
        // Adding mobiles
        Mobile mobile1 = new Mobile("Samsung Galaxy M32");
        Mobile mobile2 = new Mobile("Redmi Note 12");

        // Printing mobile models
        System.out.println("Mobile1 model: " + mobile1.getModel());
        System.out.println("Mobile2 model: " + mobile2.getModel());

        // Printing total mobiles
        Mobile.showTotalMobiles();
    }
}
