public class _27FibonacciSeries {
    public static void main(String[] args) {
        int number = 10;

        int firstTemp = 0;
        int secondTemp = 1;

        System.out.println("Fibonacci Series up to " + number + " terms:");

        for (int i = 1; i <= number; i++) {
            System.out.println(firstTemp + " ");

            int nextTemp = firstTemp + secondTemp;
            firstTemp = secondTemp;
            secondTemp = nextTemp;

        }
    }

}