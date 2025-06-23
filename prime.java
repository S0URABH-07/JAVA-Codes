//program to check if number is prime or not
import java.util.Scanner;
class prime {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int i,n,count=0;
System.out.println("please enter number:");
n=in.nextInt();
for(i=2;i<=n/2;i++){
if(n%i==0){
count++;
break;
}
}
if(count==0 && n!=1){
System.out.println(n+" is a prime");
}else{
System.out.println(n+"is not prime");
}
}
}