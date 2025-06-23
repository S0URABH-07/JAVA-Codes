// Write a Java program to increase an array list size.
import java.util.ArrayList;
public class IncreaseArrayListSize {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        list.ensureCapacity(50);
        System.out.println("Initial size: " + list.size());
        for (int i = 0; i < 40; i++) {
            list.add("Item " + (i+1));
        }
        System.out.println("Size after adding elements: " + list.size());
    }
}