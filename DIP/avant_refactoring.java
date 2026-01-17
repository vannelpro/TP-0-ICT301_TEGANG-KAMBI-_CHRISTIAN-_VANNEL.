public class MTNPayment {
    public void pay() {
        System.out.println("Paying with MTN");
    }
}

public class OrderService {
    public void processOrder() {
        MTNPayment payment = new MTNPayment();
        payment.pay();
    }
}
