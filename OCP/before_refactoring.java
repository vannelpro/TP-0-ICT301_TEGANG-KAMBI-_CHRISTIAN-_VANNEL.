public class PaymentService {

    public void pay(String type) {
        if (type.equals("MTN")) {
            System.out.println("Paying with MTN Mobile Money");
        } 
        else if (type.equals("Orange")) {
            System.out.println("Paying with Orange Money");
        } 
        else if (type.equals("Visa")) {
            System.out.println("Paying with Visa");
        }
    }
}
