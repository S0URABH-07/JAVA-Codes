//Write a program which accepts days as integer and display total number of years, month and Days in it.
import java.util.Scanner;
class Days
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
System.out.println("SOURABH DHAKAD");
System.out.println("Enrollment : 0873CS231120");
System.out.print("Enter the number of Days: ");
int totalDays=ob.nextInt();
int years=totalDays / 365;
int remainingDays=totalDays % 365;
int months=remainingDays / 30;
int Days=remainingDays % 30;
System.out.println("Days is equivalent to : "+totalDays);
System.out.println("Years : "+years);
System.out.println("Months: "+months);
System.out.println("Days : "+Days);
}
}