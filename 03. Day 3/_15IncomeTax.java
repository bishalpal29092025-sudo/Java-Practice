import java.util.Scanner;

public class _15IncomeTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your total annual income in INR: ");
        double income = scanner.nextDouble();

        double tax = 0;
        if (income <= 400000) {
            tax = 0;
        } else if (income <= 800000) {
            tax = (income - 400000) * 0.05;
        } else if (income <= 1200000) {
            tax = 20000 + (income - 800000) * 0.10;
        } else if (income <= 1600000) {
            tax = 60000 + (income - 1200000) * 0.15;
        } else if (income <= 2000000) {
            tax = 120000 + (income - 1600000) * 0.20;
        } else if (income <= 2400000) {
            tax = 200000 + (income - 2000000) * 0.25;
        } else {
            tax = 300000 + (income - 2400000) * 0.30;
        }

        // 2. Calculate Surcharge (For high earners)
        double surcharge = 0;
        if (income > 5000000 && income <= 10000000) {
            surcharge = tax * 0.10; // 10% Surcharge
        } else if (income > 10000000 && income <= 20000000) {
            surcharge = tax * 0.15; // 15% Surcharge
        } else if (income > 20000000) {
            surcharge = tax * 0.25; // 25% Surcharge
        }

        // 3. Calculate Health & Education Cess (4% on Tax + Surcharge)
        double totalTaxBeforeCess = tax + surcharge;
        double cess = totalTaxBeforeCess * 0.04;

        double finalTax = totalTaxBeforeCess + cess;
        double takeHome = income - finalTax;

        // 4. Output Results
        System.out.println("\n--- Tax Breakdown ---");
        System.out.printf("Base Income Tax:   ₹%,.2f%n", tax);
        System.out.printf("Surcharge Applied: ₹%,.2f%n", surcharge);
        System.out.printf("4%% Education Cess: ₹%,.2f%n", cess);
        System.out.println("-----------------------");
        System.out.printf("TOTAL TAX PAYABLE: ₹%,.2f%n", finalTax);
        System.out.printf("NET TAKE-HOME:     ₹%,.2f%n", takeHome);
        scanner.close();
    }
}


