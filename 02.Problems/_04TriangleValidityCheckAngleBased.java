public class _04TriangleValidityCheckAngleBased {

    public static void main(String[] args) {
        int angleA = 60;
        int angleB = 60;
        int angleC = 60;

        int sum = angleA + angleB + angleC;
        if (sum == 180) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}