public class UserManager {

    public void createUser(String name, String email) {
        System.out.println("User created: " + name);
        validateEmail(email);
        saveToDatabase(name, email);
        sendEmail(email);
    }

    public void validateEmail(String email) {
        System.out.println("Validating email...");
    }

    public void saveToDatabase(String name, String email) {
        System.out.println("Saving user to database...");
    }

    public void sendEmail(String email) {
        System.out.println("Sending welcome email...");
    }
}
