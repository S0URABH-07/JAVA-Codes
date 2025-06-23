// Fabonacchi series 
import java.util.Scanner;
class Fabonacchi
{
 public static void main(String args[])
   { 
      Scanner scr=new Scanner(System.in);
      int n,i,f=-1,t=1,p;
      n=scr.nextInt();
      for(i=0;i<n;i++)
        {
         p=f+t;
         System.out.println(p);
         f=t;
         t=p;
        }
   }
}