import java.util.Scanner;

public class _03CheckAutomorphic {

    public static boolean isAutomorphic(int number){
        int square = number * number;
        String numberString = Integer.toString(number);
        String squareString = Integer.toString(square);
        return squareString.endsWith(numberString);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(isAutomorphic(number)){
            System.out.println(number + " is an Automorphic Number");
        } else {
            System.out.println(number + " is not an Automorphic Number");
        }

        scanner.close();
    }
    
}