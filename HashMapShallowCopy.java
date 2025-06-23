// Write a Java program to create a shallow copy of a HashMap instance
import java.util.HashMap;

public class HashMapShallowCopy {
    public static void main(String[] args) {
        HashMap<String, String> original = new HashMap<>();
        original.put("Name", "SOURABH");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        HashMap<String, String> copy = new HashMap<>(original);
        System.out.println("Shallow copy of map: " + copy);
    }
}