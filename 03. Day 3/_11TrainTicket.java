import java.util.Scanner;
public class _11TrainTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of ticket (1 for General, 2 for Sleeper, 3 for AC ,4 for AC Sleeper): ");
        int ticketType = scanner.nextInt();

        System.out.println("Enter the age of the passenger: ");
        int age = scanner.nextInt();

        double price = 0.0;
        switch (ticketType){
            case 1: 
                price = 500.0;
                break;
                case 2:
                price = 1000.0;
                break;
                case 3:
                price = 1500.0;
                break;
                case 4:
                price = 2000.0;
                break;
                default:
                System.out.println("Invalid ticket type");
                scanner.close();
                return ;
        }

        if(age < 5){
            price = 0.0;
        } else if(age >= 5 && age < 18){
            price = price * 0.5;
        } else if(age >= 60){
            price = price * 0.7;
        }
        System.out.println("The price of the ticket is: " + price);
        scanner.close();
        
    }
}