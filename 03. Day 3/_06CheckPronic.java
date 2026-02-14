import java.util.Scanner;
public class _06CheckPronic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int originalNumber = scanner.nextInt();
        boolean isPronic = false;

        for(int i = 0; i <= originalNumber; i++){
            if(i * (i + 1) == originalNumber){
                System.out.println(originalNumber + " is a Pronic Number");
                isPronic = true;
                break;
            }
        }
        if(!isPronic){
            System.out.println(originalNumber + " is not a Pronic Number");
        }
        scanner.close();
    }
}