public class _02CheckNeonOrNot {
    public static void main(String[] args) {
        
        int originalNumber = 9;
        int square = originalNumber * originalNumber;
        int sumOfDigits = 0;
        int digit;

        while(square > 0){
            digit = square % 10;
            sumOfDigits = sumOfDigits + digit;
            square = square / 10;
            
        }
        if(sumOfDigits == originalNumber){
            System.out.println(originalNumber + " is a Neon Number");
        } else {
            System.out.println(originalNumber + " is not a Neon Number");
        }
    }

}