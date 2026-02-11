public class _07FactorialNumber {
    public static void main(String[] args) {
        int num = 12; 
        long count = 1; 

        for (int i = num; i >= 1; i--) {
            count = count * i; 
        }
        System.out.println("Factorial of " + num + " is: " + count);
    }
}


/* 
public class _07FactorialNumber {

    public static void main(String[] args) {
        int num = 10;
        double result = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is approximately: " + result);
    }

    public static double calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }

}


*/