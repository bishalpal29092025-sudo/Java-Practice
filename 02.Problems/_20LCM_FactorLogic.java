public class _20LCM_FactorLogic {
    public static void main(String[] args) {
        int a = 21;
        int b = 35;
        int lcm = 1;
        int divisor = 2;

        while (a > 1 || b > 1) {
            if (a % divisor == 0 || b % divisor == 0) {
                lcm *= divisor;
                
                if (a % divisor == 0) a /= divisor;
                if (b % divisor == 0) b /= divisor;
            } else {
                divisor++;
            }
        }

        System.out.println("LCM using Factor Logic: " + lcm);
    }
}