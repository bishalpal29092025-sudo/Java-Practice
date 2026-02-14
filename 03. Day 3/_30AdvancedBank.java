import java.util.Scanner;

public class _30AdvancedBank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the account balance: ");
        double balance = scanner.nextDouble();
        double interest = calculateInterest(balance);
        System.out.printf("The interest earned is: %.2f\n", interest);
        scanner.close();
        
    }
    
    public static double calculateInterest(double balance) {
        if(balance > 10000) {
            return balance * 0.05; // 5% interest for high balance
        } else {
            return balance * 0.02; // 2% interest for low balance
        }
    }
}