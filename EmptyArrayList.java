// Write a Java program to empty an array list.
import java.util.ArrayList;
public class EmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original list: " + list);
        list.clear();
        System.out.println("List after clear(): " + list);
    }
}