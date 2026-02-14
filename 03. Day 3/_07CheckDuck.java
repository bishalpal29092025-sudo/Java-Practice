import java.util.Scanner;

public class _07CheckDuck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String numberString = scanner.nextLine();

        if(numberString.contains("0") && !numberString.startsWith("0")){
            System.out.println(numberString + " is a Duck Number");
        } else {
            System.out.println(numberString + " is not a Duck Number");
        }

        scanner.close();
    }
}
