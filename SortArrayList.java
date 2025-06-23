//Write a Java program to sort a given ArrayList.
import java.util.ArrayList;import java.util.Collections;
import java.util.Comparator;import java.util.Scanner;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Cherry");
        System.out.println("SOURABH DHAKAD\nENROLLMENT : 0873CS231120");
        System.out.println("Original ArrayList: " + fruits);
        Collections.sort(fruits);
        System.out.println("\nSorted in ascending order: " + fruits);
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " + fruits);
        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);    }
           });
        System.out.println("Sorted in descending order (alternative): " + fruits);
        fruits.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("\nRe-sorted in ascending order (lambda): " + fruits);
        fruits.sort(Comparator.comparingInt(String::length));
        System.out.println("\nSorted by string length: " + fruits);
        fruits.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        System.out.println("Sorted by length then alphabetically: " + fruits);
        }
}