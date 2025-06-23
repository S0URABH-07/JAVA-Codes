// Write a Java program to iterate through all elements in a linked list.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class IterateLinkedList {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original LinkedList: " + colors);
        System.out.println("\nUsing for loop");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at position " + i + ": " + colors.get(i));
        }
    }
}