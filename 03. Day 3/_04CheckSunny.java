import java.util.Scanner;

public class _04CheckSunny {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int originalNumber = scanner.nextInt();
        int nextNumber = originalNumber + 1;
        int squareRoot = (int) Math.sqrt(nextNumber);
        
        if(squareRoot * squareRoot == nextNumber){
            System.out.println(originalNumber + " is a Sunny Number");
        } else {
            System.out.println(originalNumber + " is not a Sunny Number");
        }
        scanner.close();
    }
}