//calculate series: 1^2+2^2+3^2+...........
import java.util.Scanner;
class Square_series
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n, sum=0;
System.out.println("given series:1^2+2^2+3^2+");
System.out.println("enter values of n:");
n=in.nextInt();
for(int i=1;i<=n;i++)
{
sum=sum+i*i;
System.out.println("sum of series:"+sum);
}
System.out.println("sum of series:"+sum);
}
}