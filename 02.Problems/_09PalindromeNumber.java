public class _09PalindromeNumber {

    public static void main(String[] args) {
        int num = 12321;
        int reversed = 0;
        boolean  isPalindrome = true;
        int originalNum = num;

        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if(originalNum != reversed){
            isPalindrome = false;
        }else{
            isPalindrome = true;
        }
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}