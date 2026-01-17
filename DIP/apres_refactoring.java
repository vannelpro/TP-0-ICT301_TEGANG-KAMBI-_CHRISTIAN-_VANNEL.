public interface Payment {
    void pay();
}

public class MTNPayment implements Payment {
    public void pay() {
        System.out.println("Paying with MTN");
    }
}

public class OrangePayment implements Payment {
    public void pay() {
        System.out.println("Paying with Orange Money");
    }
}

public class OrderService {
    public void processOrder(Payment payment) {
        payment.pay();
    }
}
