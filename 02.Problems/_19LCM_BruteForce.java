public class _19LCM_BruteForce {

    public static int findLCM(int num1,int num2){
        int a = num1;
        int b = num2;
        
        int max = (a > b) ? a : b;
        int lcm = max;
        while(true){
            if(lcm % a == 0 && lcm % b == 0){
                return lcm;
            }
            lcm = lcm + max;
        }
    }

    public static void main(String[] args) {
        int num1 = 21;
        int num2 = 35;

        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " using LCM_BruteForce Method" + " is: " + lcm);
    }
}