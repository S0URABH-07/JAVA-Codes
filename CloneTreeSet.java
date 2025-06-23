// Write a Java program to clone a TreeSet into another TreeSet
import java.util.TreeSet;

public class CloneTreeSet {
    public static void main(String[] args) {
        // Create the original TreeSet
        TreeSet<String> originalSet = new TreeSet<>();

        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Cherry");
        originalSet.add("Date");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original TreeSet: " + originalSet);
        TreeSet<String> clonedSet= new TreeSet<>();
        clonedSet.addAll(originalSet);
        System.out.println("Cloned TreeSet : " + clonedSet);
    }
}