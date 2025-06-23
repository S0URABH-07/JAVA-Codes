//Program to show sum and average of 10 element array. Accept array elements from user.
import java.util.Scanner;
public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        // Accepting 10 elements from the user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / 10;
        // Displaying sum and average
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        sc.close();
    }
}
