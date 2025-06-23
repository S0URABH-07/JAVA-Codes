//write a program to swap two numbers without involving third variable
import java.util.Scanner;
class swap
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b;
System.out.println("enter a and b:");
a=in.nextInt();
b=in.nextInt();
a = a+b;
b = a-b;
a = a-b;
System.out.println("after swapping a and b");
System.out.println("print a = "+a) ;
System.out.println("print b = "+b) ;
}
}