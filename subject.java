// Program to calculate sum pf 5 subjects and find Percentage.
import java.util.Scanner;
class subject
{
public static void main(String args[])
{
float ADA, SE, COA, M3, OS;
Scanner ob=new Scanner (System.in);
System.out.println("SOURABH DHAKAD");
System.out.println("ENROLLMENT : 0873CS231120");
System.out.println("Enter Marks :");
ADA=ob.nextFloat();
SE=ob.nextFloat();
COA=ob.nextFloat();
M3=ob.nextFloat();
OS=ob.nextFloat();
float sum=(ADA+SE+COA+M3+OS);
float per=sum/5;
System.out.println("Sum is "+sum);
System.out.println("Per is "+per);
}
}