// Create a array of 17 elements in 5 rows. And calculate sum of all elements
import java.util.Scanner;
public class ArraySum2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[5][];
        int totalElements = 17;
        int sum = 0;
        int inputCount = 0;
        array[0] = new int[4];
        array[1] = new int[4];
        array[2] = new int[3];
        array[3] = new int[3];
        array[4] = new int[3];
        System.out.println("Enter 17 elements:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Element " + (++inputCount) + ": ");
                array[i][j] = sc.nextInt();
                sum += array[i][j];}}
        System.out.println("Sum of all 17 elements = " + sum);
        sc.close();
    }
}
