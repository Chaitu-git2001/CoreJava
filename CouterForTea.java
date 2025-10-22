class TeaCup {
    // Instance variable
    private String teaType;

    // Static variable to count total cups
    private static int totalCups = 0;

    // Constructor
    public TeaCup(String teaType) {
        this.teaType = teaType;
        totalCups++;  // Increment when a new cup is created
    }

    // Getter for teaType
    public String getTeaType() {
        return teaType;
    }

    // Static method to show total cups
    public static void showTotalCups() {
        System.out.println("Total cups made: " + totalCups);
    }
}

public class CouterForTea {
    public static void main(String[] args) {
        // Creating cups
        TeaCup cup1 = new TeaCup("Masala Tea");
        TeaCup cup2 = new TeaCup("Green Tea");
        TeaCup cup3 = new TeaCup("Ginger Tea");

        // Printing tea types
        System.out.println("Cup1 type: " + cup1.getTeaType());
        System.out.println("Cup2 type: " + cup2.getTeaType());
        System.out.println("Cup3 type: " + cup3.getTeaType());

        // Printing total cups
        TeaCup.showTotalCups();
    }
}
