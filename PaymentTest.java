abstract class Payment {
    abstract void pay();
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private int amount;

    public CreditCardPayment(String cardNumber, int amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + amount + " Paid");
    }
}

class UPIPayment extends Payment {
    private String upiId;
    private int amount;

    public UPIPayment(String upiId, int amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + amount + " Paid");
    }
}


public class PaymentTest {
    public static void main(String[] args) {
        
        Payment credit = new CreditCardPayment("1234567890123456", 5000);
        Payment upi = new UPIPayment("rahul@upi", 2000);

        
        credit.pay();
        upi.pay();
    }
}
