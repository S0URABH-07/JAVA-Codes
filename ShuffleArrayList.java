//. Write a Java program to shuffle elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class ShuffleArrayList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Black");
        colors.add("White");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original List: " + colors);
        Collections.shuffle(colors, new Random());
        System.out.println("Shuffled List (with Random object):\n" + colors);
        System.out.println("\nManually Shuffled List:\n" + colors);
    }
}