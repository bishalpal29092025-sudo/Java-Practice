import java.util.Scanner;
public class _21Hospital {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days you stayed in the hospital: ");
        int days = scanner.nextInt();
        double room = 5000 * days;
        System.out.print("Enter the cost of the medicines: ");
        double medicines = scanner.nextDouble();
        System.out.print("Enter the doctor's fee: ");
        double doctorFee = scanner.nextDouble();
        
        double totalCost = room + medicines + doctorFee;
        System.out.println("The total cost of the hospital stay is: " + totalCost);

        scanner.close();
    }
}