public class _11SumOfOddEvenSeries {
    public static void main(String[] args) {
        int n = 9;

        int oddSum = 0;
        int evenSum = 0;

        for ( int i = 1; i <= n ; i++){
            if(i % 2 == 0){
                evenSum = evenSum + i;
            }else{
                oddSum = oddSum + i;
            }
        }
        System.out.println("EvenSum : " + evenSum);
        System.out.println("OddSum : " + oddSum);
    }
}
