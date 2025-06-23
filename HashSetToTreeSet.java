//Write a Java program to convert a HashSet into a TreeSet
import java.util.HashSet;
import java.util.TreeSet;
public class HashSetToTreeSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}