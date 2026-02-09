public class _03PrintTable {
    public static void main(String[] args) {
        int num = 4;
        int row = 1;
        System.out.println("a a^2 a^3");
        for (row = 1; row <= num; row++ ){
            System.out.println(row + " "+ row * 2+ " "+ row * row * row);
        }
    }
}