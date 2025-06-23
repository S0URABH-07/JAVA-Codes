import java.util.Scanner;
class seven
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
                   System.out.print(k);
                   }
            System.out.print("\n");
        }
   }
}