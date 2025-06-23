//Write a Java program to insert an element into the ArrayList at the first position.
import java.util.ArrayList;
public class InsertAtFirstPosition {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original ArrayList: " + colors);
        colors.add(0, "Yellow");
        System.out.println("After inserting 'Yellow' at first position: " + colors);
        colors.add(0, "Orange");
        System.out.println("After inserting 'Orange' at first position: " + colors);
    }
}