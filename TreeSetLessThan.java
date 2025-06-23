// Write a Java program to find numbers less than 7 in a TreeSet
import java.util.TreeSet;

public class TreeSetLessThan {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
    System.out.println("Numbers less than 7: " + numbers.headSet(7));
    }
}