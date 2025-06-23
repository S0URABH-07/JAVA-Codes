// Write a Java program to append a specified element to the end of a linked list
import java.util.LinkedList;
public class AppendToLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original LinkedList: " + fruits);
        String newFruit = "Mango";
    
        fruits.add(newFruit);
        System.out.println("\nAfter append using add(): " + fruits);
    }
}