import java.util.Scanner;
public class _24LibraryFine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many days you delayed in returning the book: ");
        int daysDelayed = scanner.nextInt();
        int fine = 0;
        if(daysDelayed > 0 && daysDelayed <= 5) {
            fine = 10;
        } else if(daysDelayed > 5 && daysDelayed <= 10) {
            fine = 20;
        } else if(daysDelayed > 10 && daysDelayed <= 15) {
            fine = 30;
        } else {
            fine = 50;
        }
        System.out.println("Your library fine is: " + fine + " Rs.");
        scanner.close();
    }
}