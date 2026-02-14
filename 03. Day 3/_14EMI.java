import java.util.Scanner;
public class _14EMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the annual rate of interest (in %): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter the time period in years: ");
        int years = sc.nextInt();


        double r = annualRate / (12 * 100);

        int n = years * 12;

        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);

        System.out.printf("\nThe monthly EMI is: %.2f%n", emi);
        
        double totalPayment = emi * n;
        System.out.printf("Total amount payable: %.2f%n", totalPayment);
        sc.close();
    }
}