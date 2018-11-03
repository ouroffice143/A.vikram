import java.util.Scanner;

public class MatrixAdditionmul {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of rows: ");
       int r = sc.nextInt();
       System.out.print("Enter number of columns: ");
       int c = sc.nextInt();
       int[][] a = new int[r][c];
       int[][] b = new int[r][c];
       
       System.out.println("Enter the first matrix");
       for (int i = 0; i < r; i++) {
           for (int j = 0; j < c; j++) {
               a[i][j] = sc.nextInt();
           }
       }
       System.out.println("Enter the second matrix");
       for (int i = 0; i < r; i++) {
           for (int j = 0; j < c; j++) {
               b[i][j] = sc.nextInt();
           }
       }
       int[][] d = new int[r][c];
       for (int i = 0; i < r; i++) {
           for (int j = 0; j < c; j++) {
               d[i][j] = a[i][j] + b[i][j];
           }
       }
       System.out.println("The sum of the two matrices");
       for (int i = 0; i < r; i++) {
           for (int j = 0; j < c; j++) {
               System.out.print(d[i][j] + " ");
           }
           System.out.println();
       }
       int z[][]=new int[r][c];
       for (int i = 0; i < r; i++) {
           for (int j = 0; j < c; j++) {
               z[i][j] = a[i][j] * b[i][j];
           }
       }
       System.out.println("The multiplication of two matrix");
       for (int i = 0; i < r; i++) {
           for (int j = 0; j < c; j++) {
               System.out.println(z[i][j]);
           }
       }
       
   }
}