//Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original List: " + colors);
        Collections.reverse(colors);
        System.out.println("Reversed List: " + colors);
    }
}