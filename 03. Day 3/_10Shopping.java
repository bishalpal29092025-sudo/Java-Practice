import java.util.Scanner;
public class _10Shopping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of the item: ");
        double price = scanner.nextDouble();
        
        System.out.println("Enter the quantity of the item: ");
        double quantity = scanner.nextDouble();

        double totalCost = quantity * price;
        double gst = totalCost * 0.18;
        double discount = totalCost * 0.10;
        totalCost = totalCost + gst - discount;


        System.out.println("Total cost: " + totalCost);
        scanner.close();
    }
}