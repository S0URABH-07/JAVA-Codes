// Write a Java program that swaps two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
public class SwapArrayListElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
System.out.println("Original ArrayList: " + colors);
    swapElements(colors, 1, 3);
System.out.println("After swapping positions 1 and 3: " + colors);
    Collections.swap(colors, 0, 2); 
System.out.println("After swapping positions 0 and 2:" + colors);}
    public static <T> void swapElements(ArrayList<T> list, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= list.size() || index2 >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid indices for swapping");}
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}