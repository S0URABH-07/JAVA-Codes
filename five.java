import java.util.Scanner;
class five
{
 public static void main(String args[])
   { 
     int i,j,k;
      for(i=0;i<10;i++)
        {
         for(j=0;j<=10-i;j++)
             {
              System.out.print(" ");
             }
               for(k=0;k<=i;k++)
                   {
                   System.out.print("*");
                   }
            System.out.print("\n");
        }
   }
}