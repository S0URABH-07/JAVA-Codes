//Write a Java program to update an ArrayList element by a given element
import java.util.ArrayList;
import java.util.Scanner;
public class UpdateArrayListElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original ArrayList: " + fruits);
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the index of the element you want to update (0 to " + (fruits.size()-1) + "): ");
            int index = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the new element: ");
            String newElement = scanner.nextLine();
            String oldElement = fruits.set(index, newElement);
            System.out.println("Updated element at index " + index + ": Replaced '" + oldElement + "' with '" + newElement + "'");
            System.out.println("Updated ArrayList: " + fruits);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: The specified index is out of bounds.");
        } catch (Exception e) {System.out.println("Error: Invalid input.");
}
 finally {scanner.close();
}
}
}