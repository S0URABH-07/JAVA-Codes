//Write a Java program to count the number of elements in a TreeSet.
import java.util.TreeSet;

public class CountTreeSetElements {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
    
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        int count = colors.size();
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("TreeSet elements: " + colors);
        System.out.println("Number of elements in the TreeSet: " + count);
    }
}