public interface PaymentMethod {
    void pay();
}

public class MTNPayment implements PaymentMethod {
    public void pay() {
        System.out.println("Paying with MTN Mobile Money");
    }
}

public class OrangePayment implements PaymentMethod {
    public void pay() {
        System.out.println("Paying with Orange Money");
    }
}

public class VisaPayment implements PaymentMethod {
    public void pay() {
        System.out.println("Paying with Visa");
    }
}

public class PaymentService {
    public void process(PaymentMethod method) {
        method.pay();
    }
}
