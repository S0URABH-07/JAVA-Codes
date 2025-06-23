// Write a Java program to join two array lists
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class JoinArrayLists {
    public static void main(String[] args) {
        
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        
        List<String> list2 = new ArrayList<>();
        list2.add("Grapes");
        list2.add("Mango");
        list2.add("Pineapple");
        System.out.println("SOURABH DHAKAD");
        System.out.println("ENROLLMENT : 0873CS231120");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        List<String> joinedList = new ArrayList<>();
        joinedList.addAll(list1);
        joinedList.addAll(list2);
        System.out.println("\nJoined list: " + joinedList);
    }
}