//Write a Java program to create an ArrayList, add some colors (as strings), and print the collection.
import java.util.ArrayList;
public class ColorList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("Colors in the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("\nEntire ArrayList:");
        System.out.println(colors);
    }
}