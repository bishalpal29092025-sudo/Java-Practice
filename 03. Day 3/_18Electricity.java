import java.util.Scanner;

public class _18Electricity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();
        double bill = 0;
        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        } else if (units <= 300) {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 4;
        } else {
            bill = (100 * 2) + (100 * 3) + (100 * 4) + (units - 300) * 5;
        }
        System.out.println("Total Electricity Bill: ₹" + bill);
        scanner.close();
    }
}