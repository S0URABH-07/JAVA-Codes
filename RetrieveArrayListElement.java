//Write a Java program to retrieve an element at a specified index from a given ArrayList
import java.util.ArrayList;
import java.util.Scanner;
public class RetrieveArrayListElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("ArrayList: " + colors);
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the index of the element you want to retrieve: ");
            int index = scanner.nextInt();
            String element = colors.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: The specified index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();}}}