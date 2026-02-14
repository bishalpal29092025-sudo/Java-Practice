import java.util.Scanner;
public class _12Restaurant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double totalBill = 0.0;

        do{
            System.out.println("Welcome to the Restaurant!");
            System.out.println("1. Pizza - Rs. 200");
            System.out.println("2. Burger - Rs. 150");
            System.out.println("3. Pasta - Rs. 180");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    totalBill += 200;
                    break;
                case 2:
                    totalBill += 150;
                    break;
                case 3:
                    totalBill += 180;
                    break;
                case 4:
                    System.out.println("Total bill: Rs. " + totalBill);
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 5);
        scanner.close();
    }
}