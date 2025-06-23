//Write a Java program to search for an element in an ArrayList
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Available fruits: " + fruits);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a fruit to search: ");
        String searchElement = scanner.nextLine();
        if (fruits.contains(searchElement)) {
            int position = fruits.indexOf(searchElement);
            System.out.println("'" + searchElement + "' found at index position " + position);
        } else {
            System.out.println("'" + searchElement + "' not found in the list");
        }
        scanner.close();
    }
}