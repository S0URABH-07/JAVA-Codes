//Write a Java program to copy all mappings from one map to another.
import java.util.HashMap;

public class HashMapCopy {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Copied HashMap: " + map2);
    }
}