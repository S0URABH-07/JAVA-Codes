// Write a Java program to iterate through all elements starting from a specified position in a linked list.
import java.util.LinkedList;
import java.util.ListIterator;
public class IterateFromPosition {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Zebra");
        animals.add("Monkey");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original LinkedList: " + animals);

        int startPosition = 2; // Starting from index 2 (3rd element)
        System.out.println("\nIterating from position " + startPosition + ":");
        System.out.println("\nUsing for loop");
        for (int i = startPosition; i < animals.size(); i++) {
            System.out.println("Element at position " + i + ": " + animals.get(i));
        }
    }
}