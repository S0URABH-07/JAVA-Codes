//Write a Java program to check if a map is empty or contains key-value mappings
import java.util.HashMap;

public class HashMapIsEmpty {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();     
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Map is empty? " + map.isEmpty());
        map.put(10, "Ten");
        System.out.println("Map is empty after adding element? " + map.isEmpty());
    }
}