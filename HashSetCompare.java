//Write a Java program to compare two HashSets
import java.util.HashSet;

public class HashSetCompare {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("X");
        set1.add("Y");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        HashSet<String> set2 = new HashSet<>();
        set2.add("Y");
        set2.add("X");
        System.out.println("Are sets equal? " + set1.equals(set2));
    }
}