import java.util.*;
public class AdditionM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first matrix
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr2 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr2[i][j] = sc.nextInt();
              }
          }

        // Validate dimensions
        if (r != r1 || c != c1) {
            System.out.println("Matrix dimensions do not match. Addition not possible.");
            return;
        }

        // Perform addition
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
