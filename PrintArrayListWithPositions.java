//Write a Java program to print all the elements of an ArrayList using the elements' position
import java.util.ArrayList;

public class PrintArrayListWithPositions {
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
         System.out.println("SOURABH DHAKAD");
         System.out.println("ENROLLMENT : 0873CS231120");

        System.out.println("Elements of the ArrayList with their positions:" +fruits);
        System.out.println("\nelements of an ArrayList using the elements position");
        int position = 0;
        for (String fruit : fruits) {
            System.out.println("Position " + (position++) + ": " + fruit);
        }
    }
}