//Write a Java program to convert a HashSet into an array
import java.util.HashSet;
public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        String[] array = new String[set.size()];
        set.toArray(array);
        System.out.println("Array elements:");
        for (String s : array) {
            System.out.println(s);
        }
    }
}