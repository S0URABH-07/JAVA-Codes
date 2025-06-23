// Write a Java program to insert a specified element at a given position in a linked list
import java.util.LinkedList; 
public class InsertInLinkedList { 
    public static void main(String[] args) { 
        LinkedList<String> list = new LinkedList<>(); 
        list.add("Apple"); 
        list.add("Banana"); 
        list.add("Cherry"); 
        System.out.println("SOURABH DHAKAD"); 
        System.out.println("ENROLLMENT : 0873CS231120"); 
        System.out.println("Original LinkedList: " + list);         
        String elementToInsert = "Orange"; 
        int position = 1; // Index is zero-based, so 1 means insert after “Apple” 
        list.add(position, elementToInsert); 
        System.out.println("Updated LinkedList after insertion: " + list); 
    } 
}