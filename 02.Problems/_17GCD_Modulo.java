public class _17GCD_Modulo {

    public static void main(String[] args) {
        int num1 = 21;
        int num2 = 35;

        int a = num1;
        int b = num2;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " using GCD_Modulo Method" + " is: " + a);
    }
}