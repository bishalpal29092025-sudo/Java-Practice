public class _01CheckSpyOrNot {

    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        int digit;
        int originalNumber = 1124; 
        int temp = originalNumber; // We use temp for calculation
        
        while(temp > 0){
            digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }
        if(sum == product){
            System.out.println(originalNumber + " is a Spy Number");
        } else {
            System.out.println(originalNumber + " is not a Spy Number");
        }
    }
}

