public class _05PrintAllPrimeNumbers {

    public static void main(String[] args) {
        int num = 100;
        System.out.println("Prime numbers between 1 and " + num + ":");

        int i , j;
        for (i = 2; i <= num; i++){
            boolean isPrime = true;
            for (j = 2; j * j <= i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}