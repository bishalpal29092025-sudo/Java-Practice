/*

Print this Pyramid Pattern

    * 
   * * 
  * * * 
 * * * * 
* * * * * 


*/



public class _26Pattern_5 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // 1. Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // 2. Print stars with a space after each
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // 3. Move to the next line
            System.out.println();
        }
    }
}