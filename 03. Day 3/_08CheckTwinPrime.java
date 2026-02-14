import java.util.Scanner;

public class _08CheckTwinPrime {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPrime(number) && isPrime(number + 2)) {
            System.out.println(number + " and " + (number + 2) + " are Twin Primes");
        } else {
            System.out.println(number + " and " + (number + 2) + " are not Twin Primes");
        }
        scanner.close();
    }
}