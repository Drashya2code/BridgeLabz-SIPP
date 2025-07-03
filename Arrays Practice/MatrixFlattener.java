import java.util.Scanner;

public class MatrixFlattener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] flat = new int[rows * cols];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int index = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                flat[index++] = val;
            }
        }

        System.out.print("1D Array: ");
        for (int val : flat) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
