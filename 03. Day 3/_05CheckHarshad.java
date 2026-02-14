import java.util.Scanner;

public class _05CheckHarshad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int originalNumber = scanner.nextInt();
        int sumOfDigits = 0;
        int digit;
        
        int temp = originalNumber; // We use temp for calculation
        
        while(temp > 0){
            digit = temp % 10;
            sumOfDigits = sumOfDigits + digit;
            temp = temp / 10;
        }
        if(originalNumber % sumOfDigits == 0){
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }
        scanner.close();
    }
}