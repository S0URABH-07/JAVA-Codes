//Program to find multiplication of two 3X3 matrices
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] result = new int[3][3];
        System.out.println("Enter elements of Matrix A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();}}
        System.out.println("Enter elements of Matrix B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();}}
        for (int i = 0; i < 3; i++) {          
            for (int j = 0; j < 3; j++) {      
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {  
                    result[i][j] += A[i][k] * B[k][j];}}}
        System.out.println("Result of A x B (3x3 Matrix):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + "\t");}
            System.out.println();
            }
        sc.close();
}
}
