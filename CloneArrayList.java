// Write a Java program to clone an array list to another array list.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class CloneArrayList {
    public static void main(String[] args) {
        // Create original ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Mango");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("Original ArrayList: " + originalList);
        ArrayList<String> clonedList3 = new ArrayList<>();
        clonedList3.addAll(originalList);
        System.out.println("Cloned list: " + clonedList3);
    }
}