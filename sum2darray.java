import java.util.Scanner;

public class sum2darray {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter row:");
        int row = scr.nextInt();
        System.out.println("Enter col:");
        int col = scr.nextInt();

        int a[][] = new int[row][col];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scr.nextInt();
            }
        }

        // call totalsum() after reading the full array
        System.out.println("Total sum = " + totalsum(a));
    }

    static int totalsum(int z[][]) {
        int row = z.length;
        int col = z[0].length;
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += z[i][j];
            }
        }
        return sum;
    }
}
