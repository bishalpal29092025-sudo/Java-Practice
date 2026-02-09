public class _24SwapWithoutTemp {
    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 45;

        System.out.println("Before Swapping.");
        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);

        num1 = num1 + num2;
        // System.out.println(num1);
        num2 = num1 - num2;
        // System.out.println(num2);
        num1 = num1 - num2;
        // System.out.println(num1);

        System.out.println("After Swapping");
        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);
    }
}
