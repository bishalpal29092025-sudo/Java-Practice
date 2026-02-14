import java.util.Scanner;

public class _29BonusSalary {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        double bonus = calculateBonus(salary);
        System.out.printf("The employee's bonus is: %.2f\n", bonus);
        scanner.close();
    }

    public static double calculateBonus(double salary) {
        if(salary > 50000) {
            return salary * 0.1; // 10% bonus for high salary
        } else {
            return salary * 0.05; // 5% bonus for low salary
        }
    }
}