import java.util.Scanner;
class nTable
{
 public static void main(String args[])
   { 
      int i,n;
      Scanner scr=new Scanner(System.in);
      n=scr.nextInt();
      for(i=0;i<=10;i++)
        {
         System.out.println(i*n);
        }
   }
}