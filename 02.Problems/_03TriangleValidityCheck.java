// Check if the given sides can form a valid triangle

import java.util.Scanner;
public class _03TriangleValidityCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of the three sides of the triangle.....");

        System.out.println("Enter the length of side A: ");
        int sideA = scanner.nextInt();

        System.out.println("Enter the length of side B: ");
        int sideB = scanner.nextInt();

        System.out.println("Enter the length of side C: ");
        int sideC = scanner.nextInt();

        if (sideA < (sideB +sideC)  && sideB < (sideA + sideC) && sideC < (sideA + sideB)){
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
        scanner.close();
    }
}