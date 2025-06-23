//Write a program to print area and Circumference of circle
import java.util.Scanner;
class area
{
public static void main(String args[])
{
Scanner scr=new Scanner(System.in);
System.out.println("SOURABH DHAKAD");
System.out.println("ENROLLMENT 0873CS231120");
System.out.print("Enter radius of the circle;");
double radius=scr.nextDouble();
double area=Math.PI*radius*radius;
double circumference=2*Math.PI*radius;
System.out.println("Area of the circle : "+area);
System.out.println("Circumference of the circle : "+circumference);
}
}