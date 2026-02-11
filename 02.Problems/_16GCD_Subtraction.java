public class _16GCD_Subtraction {

    public static void main(String[] args) {
        
        // Repeatedly subtract the smaller from the larger

        int num1 = 21;
        int num2 = 35;

        int a = num1;
        int b = num2;
        while(a != b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " using GCD_Subtraction Method" + " is: " + a);
    }
}