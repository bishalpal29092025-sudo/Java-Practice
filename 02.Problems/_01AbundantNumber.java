public class _01AbundantNumber {

    // Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
    public static void main(String[] args) {
        int num = 17;
        int sum = 0;
        int i;

        for (i = 1; i <= num / 2; i++){
            if (num % i == 0){
                sum += i;
            }
        }

        if(sum > num){
            System.out.println(num + " is an abundant number.");
        } else {
            System.out.println(num + " is not an abundant number.");
        }
    }
}