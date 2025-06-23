//program to find greatest in 3 numbers
import java.util.Scanner;
class greatest {
public static void main(String args[]){
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.println("enter a,b and c");
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a>b && a>c)
{
System.out.println("a is greater");
}else
if(b>c) {
System.out.println("b is greater");
}
else{
System.out.println("c is greater");
}
}
}