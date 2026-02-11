/*

* Print the following pattern for n = 4
*
* *
* * *
* * * *
* * * * *

 */


public class _22Pattern_1 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {      // controls rows
            for (int j = 1; j <= i; j++) {     // controls stars
                System.out.print("* ");
            }
            System.out.println();              // move to next line
        }
    }
}