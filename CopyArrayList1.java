//Write a Java program to copy one array list into another.
import java.util.ArrayList;
public class CopyArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Orange");
        ArrayList<String> targetList = new ArrayList<>(sourceList);
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Source List: " + sourceList);
        System.out.println("Target List: " + targetList);
    }
}