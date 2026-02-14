import java.util.Scanner;
public class _13Recharge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plan = 0;
        double amount = 0.0;

        do{
            System.out.println("Select a recharge plan: ");
            System.out.println("1. 249 for 1GB/Day data for 28 Days");
            System.out.println("2. 299 for 1.5GB/Day data for 28 Days");
            System.out.println("3. 349 for 2GB/Day + 5G data for 28 Days");
            System.out.println("4. Exit");
            plan = scanner.nextInt();

            switch (plan){
                case 1: 
                    amount = 249.00;
                    break;
                case 2:
                    amount = 299.00;
                    break;
                case 3:
                    amount = 349.00;
                    break;
                default:
                    System.out.println("Invalid plan selected!");
            }
        }while (plan != 4);
        System.out.println("You have selected plan " + plan + " with amount Rs. " + amount);
        System.out.println("Thank you for using our recharge service!");
        scanner.close();

    }
}