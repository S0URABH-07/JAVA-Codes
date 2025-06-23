//Write a Program to print simple interest
import java.util.Scanner;
class interest
{
public static void main(String args[])
{
float money, interest,time;
Scanner ob=new Scanner(System.in);
System.out.println("SOURABH DHAKAD");
System.out.println("Enrollment 0873CS231120");
System.out.print("Enter the money :");
money=ob.nextFloat();
System.out.print("Enter the interest :");
interest=ob.nextFloat();
System.out.print("Enter the Time :");
time=ob.nextFloat();
float SI=(money*interest*time)/100;
System.out.println("Simple interest is: "+SI);
}
}