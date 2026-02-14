import java.util.Scanner;
public class _16BusFare {

    public static double calculateFare(double distance, int age) {
        double fare = 0;

        // Base fare calculation
        if (distance <= 5) {
            fare = 10;
        } else if (distance <= 15) {
            fare = 10 + (distance - 5) * 2;
        } else {
            fare = 10 + (10 * 2) + (distance - 15) * 3;
        }

        // Age-based discounts
        if (age < 12) {
            fare *= 0.5; // 50% discount for children under 12
        } else if (age >= 60) {
            fare *= 0.7; // 30% discount for seniors 60 and above
        }
        return fare;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance traveled in kilometers: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter the age of the passenger: ");
        int age = scanner.nextInt();

        double fare = calculateFare(distance, age);
        System.out.printf("The bus fare is: %.2f INR%n", fare);
        scanner.close();
    }
}