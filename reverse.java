//write a program to reverse a number
import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
Scanner in= new Scanner(System.in);
int num=0, rvrs=0, t;
System.out.println("input num:");
num=in.nextInt();
while(num!=0)
{
t=num%10;
rvrs=rvrs*10+t;
num=num/10;
}
System.out.println("reverse of num is "+rvrs);
}
}