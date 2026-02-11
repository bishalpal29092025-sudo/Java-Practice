public class _06CheckPrimeNumber {

    public static void main(String[] args) {
        int num = 6;
        int i = 0;

        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }else{
            for (i = 2; i * i <= num; i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}