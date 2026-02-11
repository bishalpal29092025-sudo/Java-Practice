/*

Print this pattern:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/

public class _24Pattern_3 {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print 'i' exactly 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}