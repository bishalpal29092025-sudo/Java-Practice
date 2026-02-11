// products of digits of a number

public class _13ProductOfDigits {

    public static void main(String[] args) {
        int num = 12345;
        int product = 1;
        int digit = 0;
        while(num > 0){
            digit = num % 10;
            if(digit == 0){
                product = 0;
                break;
            }else{
                product = product * digit;
            }
            num /= 10;
            
        }
        System.out.println("Product of digits is: " + product);
    }
}