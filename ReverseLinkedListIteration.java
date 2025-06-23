//Write a Java program to iterate a linked list in reverse order.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120\n");
        System.out.println("Original LinkedList: \n" + colors);
        System.out.println("\nUsing for loop (reverse index)");
        for (int i = colors.size() - 1; i >= 0; i--) {
            System.out.println(colors.get(i));
        }
    }
}