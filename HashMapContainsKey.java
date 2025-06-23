//Write a Java program to test whether a specified key exists in the map.
import java.util.HashMap;

public class HashMapContainsKey {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        int keyToCheck = 2;
        if (map.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists with value: " + map.get(keyToCheck));
        } else {
            System.out.println("Key " + keyToCheck + " does not exist.");
        }
    }
}