public class _29Calculator {
    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 22;

        char operator = '+';

        if (operator == '+') {
            System.out.println("Additional Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Subtraction Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Multiplication Result: " + (num1 - num2));
        } else if (operator == '/') {
            if (num2 != 0)
                System.out.println("Division Result: " + (num1 / num2));
            else
                System.out.println("Division by zero");
        } else {
            System.out.println("Invalid operator");
        }
    }
}