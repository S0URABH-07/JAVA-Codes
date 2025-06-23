// Write a Java program to compare two array lists
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CompareArrayLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "JavaScript"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Python", "Java", "C++", "JavaScript"));
        List<String> list3 = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "JavaScript"));
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("list1 equals list2 (order matters): " + list1.equals(list2));
        System.out.println("list1 equals list3 (order matters): " + list1.equals(list3));
    }
}