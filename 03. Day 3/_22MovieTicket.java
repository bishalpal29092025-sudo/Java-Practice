import java.util.Scanner;

public class _22MovieTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter which type of movie ticket you want to buy (1: Normal , 2: VIP):");
        int ticketType = scanner.nextInt();

        double price = 0.0;

        if(ticketType == 1) {
            price = 150.0;

        }else if(ticketType == 2) {
            price = 250.0;
        } else {
            System.out.println("Invalid ticket type selected.");
            scanner.close();
            return;
        }
        System.out.println("The price of the ticket is: " + price);
        scanner.close();
    }
}