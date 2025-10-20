interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount);
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + amount);
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.pay(2500);

        Payment p2 = new PayPalPayment();
        p2.pay(1500);
    }
}
