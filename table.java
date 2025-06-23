//program to print table of any number
import java.util.Scanner;
class table{
public static void main(String args[])
{
int i=1,n;
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
n=in.nextInt();
for(i=1;i<=10;i++)
{
System.out.println(n+ "*" + i + "="+ n*i);
}
}
}