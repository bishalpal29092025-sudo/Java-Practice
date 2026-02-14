import java.util.Scanner;

public class _25GymFee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Sorry, you must be at least 18 years old to join this gym.");
        } else {
            double baseFee = 2000.0; 
            double finalFee = baseFee;

            System.out.print("Do you have a membership card? (yes/no): ");
            String hasMembershipCard = scanner.next();

            System.out.println("\n--- Gym Fee Receipt ---");
            if (hasMembershipCard.equalsIgnoreCase("yes")) {
                double discount = baseFee * 0.20; // 20% discount
                finalFee = baseFee - discount;
                System.out.println("Status: Member Discount Applied (20%)");
                System.out.printf("Discount Amount: -₹%.2f%n", discount);
            } else {
                System.out.println("Status: Standard Rate (No Membership)");
            }


            System.out.printf("Base Fee:  ₹%.2f%n", baseFee);
            System.out.println("-----------------------");
            System.out.printf("Total Fee: ₹%.2f%n", finalFee);
        }

        scanner.close();
    }
}