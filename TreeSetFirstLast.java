// Write a Java program to retrieve the first and last elements from a TreeSet
import java.util.TreeSet;
public class TreeSetFirstLast {
    public static void main(String[] args) {
        
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);
        numbers.add(40);
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("TreeSet elements: " + numbers);
        Integer firstElement = numbers.first();
        System.out.println("First element: " + firstElement);
        Integer lastElement = numbers.last();
        System.out.println("Last element: " + lastElement);
    }
}