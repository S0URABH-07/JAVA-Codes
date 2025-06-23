import java.util.Scanner;
class two
{
 public static void main(String args[])
   { 
     int i,j;
      for(i=0;i<10;i++)
        {
         for(j=1;j<=10-i;j++)
             {
              System.out.print("*");
             }
          System.out.print("\n");
        }
   }
}