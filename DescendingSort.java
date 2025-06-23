//Sort a ten element array in descending order.
import java.util.Scanner;
import java.util.Arrays;
public class DescendingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        // Accepting 10 elements from user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();}
        // Sorting in descending order using simple bubble sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }}}
        // Display sorted array
        System.out.println("Array in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");}
        sc.close();
    }}
