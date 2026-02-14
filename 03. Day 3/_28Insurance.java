import java.util.Scanner;
public class _28Insurance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost of the item: ");
        double cost = scanner.nextDouble();
        double insuranceCost = calculateInsurance(cost);
        System.out.printf("The insurance cost is: %.2f\n", insuranceCost);
        scanner.close();    
    }

    public static double calculateInsurance(double cost) {
        return cost * 0.8; // 80% of the item's cost is the insurance cost
    }
    
}