// Write a Java program to display the elements of a TreeSet in reverse order
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
public class ReverseTreeSet {
    public static void main(String[] args) {
    
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original TreeSet : " + colors);
        System.out.println("\nUsing descendingSet()");
        TreeSet<String> descendingColors = new TreeSet<>(colors.descendingSet());
        System.out.println("Reversed TreeSet: " + descendingColors);

    }
}