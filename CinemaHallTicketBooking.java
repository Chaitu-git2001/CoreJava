class Customer {
    
    private String name;
    private String ticketType;

    static int totalTickets = 0;

    
    Customer(String name) {
        this.name = name;
        this.ticketType = "Normal"; 
        totalTickets++;
    }

    
    Customer(String name, String ticketType) {
        this.name = name;
        this.ticketType = ticketType;
        totalTickets++;
    }

    
    void displayDetails() {
        System.out.println("Name: " + name + ", Ticket: " + ticketType);
    }
}

public class CinemaHallTicketBooking {
    public static void main(String[] args) {
        
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Pooja", "Premium");
        Customer c3 = new Customer("Amit");

        
        System.out.print("Customer1: ");
        c1.displayDetails();

        System.out.print("Customer2: ");
        c2.displayDetails();

        System.out.print("Customer3: ");
        c3.displayDetails();

        System.out.println("Total Tickets Sold: " + Customer.totalTickets);
    }
}
