import java.util.Scanner;

public class _19Parking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parking hours: ");
        int hours = scanner.nextInt();
        double fee;
        if (hours <= 2) {
            fee = 50;
        } else {
            fee = 50 + (hours - 2) * 20;
        }
        System.out.println("Total Parking Fee: ₹" + fee);
        scanner.close();
    }
}