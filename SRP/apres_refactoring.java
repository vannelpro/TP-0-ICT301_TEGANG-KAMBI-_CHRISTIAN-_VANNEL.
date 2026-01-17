public class UserService {
    public void createUser(String name, String email) {
        System.out.println("User created: " + name);
    }
}

public class EmailValidator {
    public void validate(String email) {
        System.out.println("Validating email...");
    }
}

public class EmailService {
    public void sendWelcomeEmail(String email) {
        System.out.println("Sending welcome email...");
    }
}

public class UserRepository {
    public void save(String name, String email) {
        System.out.println("Saving user to database...");
    }
}
