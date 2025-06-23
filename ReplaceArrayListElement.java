// Write a Java program to replace the second element of an ArrayList with the specified element
import java.util.ArrayList;
public class ReplaceArrayListElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original ArrayList: " + colors);
        String newElement = "Purple";
        if (colors.size() >= 2) {
            colors.set(1, newElement);
            System.out.println("\nAfter replacing second element with \"" + newElement + "\": " + colors);
        } else {
            System.out.println("\nArrayList doesn't have a second element to replace.");}
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("\nOriginal Numbers: " + numbers);
        int newNumber = 25;
        if (numbers.size() >= 2) {
            numbers.set(1, newNumber);
            System.out.println("After replacing second element with " + newNumber + ": " + numbers);
        }
    }
}