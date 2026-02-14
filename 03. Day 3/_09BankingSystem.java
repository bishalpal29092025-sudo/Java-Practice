import java.util.Scanner;
public class _09BankingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 10000;
        int choice;

        do {
            System.out.println("\n1.Deposit 2.Withdraw 3.Check Balance 4.Exit");
            choice = scanner.nextInt();

            switch(choice){
                case 1: 
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    balance = balance + depositAmount;
                    System.out.println("Amount deposited successfully. Current balance: " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    if(withdrawAmount > balance){
                        System.out.println("Insufficient balance. Current balance: " + balance);
                    } else {
                        balance = balance - withdrawAmount;
                        System.out.println("Amount withdrawn successfully. Current balance: " + balance);
                    }
                    break;
                    case 3:
                        System.out.println("Total Balance: " + balance);
            }

        }while(choice != 4);
        System.out.println("Thank you for using our banking system. Goodbye!");
        scanner.close();
    }
}