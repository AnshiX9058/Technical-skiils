package p1;
import java.util.Scanner;
public class MatrixMultiplicationMN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of first matrix (m): ");
        int m = sc.nextInt();
        System.out.print("Enter columns of first matrix / rows of second matrix (n): ");
        int n = sc.nextInt();
        System.out.print("Enter columns of second matrix (p): ");
        int p = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[n][p];
        int[][] c = new int[m][p];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
