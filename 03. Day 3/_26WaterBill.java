import java.util.Scanner;

public class _26WaterBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        double bill;
        if(units <= 50){
            bill = units * 1;

        }else if(units <= 150){
            bill = 50 * 1 + (units - 50) * 1.5;
        } else if(units <= 250){
            bill = 50 * 1 + 100 * 1.5 + (units - 150) * 2;
        } else {
            bill = 50 * 1 + 100 * 1.5 + 100 * 2 + (units - 250) * 3;
        }
        System.out.printf("The total water bill is: %.2f\n", bill);
        scanner.close();
        
    }
}