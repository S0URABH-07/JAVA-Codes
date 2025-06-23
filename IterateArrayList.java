//Write a Java program to iterate through all elements in an ArrayList.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Iterating through the ArrayList:");
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}