public class _10ArmstrongNumber {

    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int digitCount = 0;
        double sum = 0;

        int temp = num;
        while(temp != 0){
            temp /= 10;
            digitCount++;
        }

        temp = num;
        while(temp != 0){
            int digit = temp % 10;
            sum = sum + Math.pow(digit, digitCount);
            temp /= 10;
        }

        if(sum == originalNum){
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}