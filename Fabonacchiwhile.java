// Fabonacchi series  using while loop
import java.util.Scanner;
class Fabonacchiwhile
{
 public static void main(String args[])
   { 
      Scanner scr=new Scanner(System.in);
      int n,i,f=-1,t=1,p;
      n=scr.nextInt();
       i=0;
      while(i<n)
       {
         p=f+t;
         System.out.println(p);
         f=t;
         t=p;
         i++;
       }
   }
}