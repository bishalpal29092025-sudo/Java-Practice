public class _12Problem {
    public static void main(String[] args) {
        int n = 9;
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            oddSum += (2 * i - 1);
            evenSum += (2 * i);
        }
        System.out.println("Odd Sum  = " + oddSum);
        System.out.println("Even Sum = " + evenSum);
    }

}
