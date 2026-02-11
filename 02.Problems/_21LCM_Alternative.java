public class _21LCM_Alternative {

    public static void main(String[] args) {
        int a = 21;
        int b = 35;

        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        
        int lcm = max;

        // Loop jumps by the value of 'max' each time
        while (lcm % min != 0) {
            lcm = lcm + max;
        }

        System.out.println("LCM is: " + lcm);
    }
}