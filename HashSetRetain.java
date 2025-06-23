//Write a Java program to retain common elements from two sets
import java.util.HashSet;

public class HashSetRetain {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        
        HashSet<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");
        
        set1.retainAll(set2);
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Common elements: " + set1);
    }
}