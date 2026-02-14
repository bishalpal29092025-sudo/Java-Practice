import java.util.Scanner;

public class _17PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String password = scanner.nextLine();

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecial = false; // Added this

        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true; // Corrected this
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true; // Corrected this
            }
        }

        // Logical Check for "Strong"
        if (password.length() >= 8 && hasDigit && hasUpperCase && hasLowerCase && hasSpecial) {
            System.out.println("Status: Strong");
        } else if (password.length() >= 6) {
            System.out.println("Status: Medium");
        } else {
            System.out.println("Status: Weak");
        }
        scanner.close();
    }
}