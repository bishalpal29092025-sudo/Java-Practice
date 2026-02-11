public class _11ArmstrongRange {

    public static boolean isArmstrong(int num){
            int originalNum = num;
            int temp = num;
            int digitCount = 0;
            double sum = 0;

            while(temp > 0){
                temp /= 10;
                digitCount++;
            }
            temp = num;
            while(temp > 0){
                int digit = temp % 10;
                sum = sum + Math.pow(digit, digitCount);
                temp /= 10;
            }
            return sum == originalNum;
        }
    public static void main(String[] args) {
        int start = 1;
        int end = 10000;
        System.out.println("Armstrong numbers between " + start + " and " + end + "........");


        for (int i = start; i <= end; i++){
            if(isArmstrong(i)){
                System.out.println(i + " is an Armstrong number.");
            }
        }

        
    }
}