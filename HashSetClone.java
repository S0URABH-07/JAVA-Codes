// Write a Java program to clone one HashSet into another.
import java.util.HashSet;
public class HashSetClone {
    public static void main(String[] args) {
        HashSet<String> original = new HashSet<>();
        original.add("Dog");
        original.add("Cat");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        HashSet<String> clone = new HashSet<>(original);
        System.out.println("Cloned HashSet: " + clone);
    }
}