public class _15GCD {

    public static int GCD_BruteForce(int num1, int num2){
        int a = num1;
        int b = num2;
        int gcd = 1;
        int min = (a < b) ? a : b;
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int num1 = 21;
        int num2 = 35;

        int resultBruteForce = GCD_BruteForce(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " using GCD_BruteForce Method" + " is: " + resultBruteForce);
    }
}