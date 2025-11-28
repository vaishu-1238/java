import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class validatemail {
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid email: missing @ symbol");
        }
        System.out.println("Valid email: " + email);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        try {
            validateEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}