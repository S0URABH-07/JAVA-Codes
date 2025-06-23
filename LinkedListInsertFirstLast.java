// Write a Java program to insert elements at the first and last positions of a linked list
import java.util.LinkedList;
public class LinkedListInsertFirstLast {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original LinkedList: " + colors);
        colors.addFirst("Violet");
    
        colors.addLast("Yellow");
        System.out.println("\nLinkedList after insertions:");
        System.out.println(colors);
        System.out.println("\nFirst element: " + colors.getFirst());
        System.out.println("Last element: " + colors.getLast());
    }
}