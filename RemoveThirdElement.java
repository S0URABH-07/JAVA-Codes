//Write a Java program to remove the third element from an ArrayList
import java.util.ArrayList;
public class RemoveThirdElement {
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
        try {
            String removedElement = colors.remove(2);
            System.out.println("Removed element: " + removedElement);
            System.out.println("Updated ArrayList: " + colors);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: The ArrayList doesn't have a third element.");
        }
    }
}