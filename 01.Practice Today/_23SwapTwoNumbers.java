public class _23SwapTwoNumbers {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        System.out.println("Before Swapping");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping");
        System.out.println("Num1 is : " + num1);
        System.out.println("Num2 is : " + num2);
    }
    
}
