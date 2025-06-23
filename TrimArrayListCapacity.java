// Write a Java program for trimming the capacity of an array list.
import java.util.ArrayList;
public class TrimArrayListCapacity {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
System.out.println("Initial size: " + list.size());
System.out.println("Initial capacity (estimated): " + getCapacity(list));
        list.trimToSize();
    System.out.println("\nAfter trimToSize():");
    System.out.println("Size: " + list.size());
    System.out.println("Capacity (estimated): " + getCapacity(list));
    }
    private static int getCapacity(ArrayList<?> list) {
        try {
            java.lang.reflect.Field elementDataField = ArrayList.class.getDeclaredField("elementData");
            elementDataField.setAccessible(true);
            return ((Object[]) elementDataField.get(list)).length;
        } catch (Exception e) {
            return -1;
        }
    }
}