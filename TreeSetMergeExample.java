//Write a Java program to add all elements from one TreeSet to another TreeSet
import java.util.TreeSet;
public class TreeSetMergeExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Apple");
        treeSet1.add("Banana");
        treeSet1.add("Cherry");
        
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Date");
        treeSet2.add("Fig");
        treeSet2.add("Grape");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("TreeSet1 before merge: " + treeSet1);
        
        treeSet1.addAll(treeSet2);
        System.out.println("\nAfter addAll():");
        System.out.println("TreeSet1: " + treeSet1);
        
    }
}