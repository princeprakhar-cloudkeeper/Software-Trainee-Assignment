public class Main {
    public static void main(String[] args) {
        try {
            String email = "invalidEmail.com";
            validateEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid email: " + email);
        }
        System.out.println("Email is valid: " + email);
    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

