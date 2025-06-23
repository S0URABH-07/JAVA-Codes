//program to check whether year is leap or not
import java.util.Scanner;
class leapyear
{
public static void main(String args[])
{
int year;
System.out.println("SOURABH DHAKAD");
System.out.println("ENROLLMENT : 0873CS231120");
Scanner in=new Scanner(System.in);
System.out.println("Enter the year");
year=in.nextInt();
if((year%4==0) && (year%100!=0) || (year%400==0))
{
System.out.println("year is leap year");
}else
{
System.out.println("year is not leap year");
}
}
}