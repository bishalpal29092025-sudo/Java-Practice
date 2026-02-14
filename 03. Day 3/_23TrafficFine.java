import java.util.Scanner;

public class _23TrafficFine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the speed you were driving: ");
        int speedLimit = scanner.nextInt();

        System.out.println("Do you have a valid driver's license? (true/false): ");
        boolean hasValidLicense = scanner.nextBoolean();

        System.out.println("Do you have valid helmet? (true/false): ");
        boolean hasValidHelmet = scanner.nextBoolean();
        int fineAmount = 0;
        double totalFine = 0.0;
        if(speedLimit > 50){
            System.out.println("You are fine for speeding. Your fine for speeding is 1000 Rs.");
            fineAmount = 1000;
        }
        if(!hasValidLicense){
            System.out.println("You are fined for not having a valid driver's license.");
            fineAmount += 500;
        }
        if(!hasValidHelmet){
            System.out.println("You are fined for not wearing a valid helmet.");
            fineAmount += 200;
        }
        totalFine = fineAmount;
        System.out.println("Total Fine Amount: " + totalFine + " Rs.");
        scanner.close();
    }
}