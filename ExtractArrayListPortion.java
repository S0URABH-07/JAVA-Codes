//Write a Java program to extract a portion of an array list.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ExtractArrayListPortion {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Pineapple");
        fruits.add("Watermelon");
        System.out.println("SOURABH DHAKAD\nENROLLMENT : 0873CS231120");
        System.out.println("Original ArrayList: " + fruits);
        Scanner scanner = new Scanner(System.in);try {
System.out.print("Enter start index(0-"+ (fruits.size()-1) + "): ");
int fromIndex = scanner.nextInt();
System.out.print("Enter end index("+fromIndex+"-"+(fruits.size()-1) + "): ");
int toIndex = scanner.nextInt();
List<String> subList = fruits.subList(fromIndex, toIndex + 1);
System.out.println("\nExtracted sublist (index " + fromIndex + " to" + toIndex + "): " + subList);
System.out.println("\nSublist is backed by original list...");
System.out.println("Changing first element of sublist to 'Peach'");
subList.set(0, "Peach");
System.out.println("Updated sublist: " + subList);
System.out.println("Original list now: " + fruits);
} catch (IndexOutOfBoundsException e) {
System.out.println("Error: Invalid index range. Please enter valid indices.");
} catch (IllegalArgumentException e) {
    System.out.println("Error: End index must be greater than start index.");} finally {
scanner.close();
        }
    }
}