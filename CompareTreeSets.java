//  Write a Java program to compare two TreeSets.
import java.util.TreeSet;
public class CompareTreeSets {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Banana");
        set2.add("Apple");
        set2.add("Date");
        set2.add("Cherry");
        
        TreeSet<String> set3 = new TreeSet<>();
        set3.add("Apple");
        set3.add("Banana");
        set3.add("Cherry");
         System.out.println("SOURABH DHAKAD");
          System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Set3: " + set3);
        System.out.println("\nComparing set1 and set2 :  " + set1.equals(set2));
        System.out.println("Comparing set1 and set3 : " + set1.equals(set3));
    }
}