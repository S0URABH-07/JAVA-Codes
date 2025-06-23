import java.util.Scanner;
class n
{
 public static void main(String args[])
   { 
     int i,j,k,n;
     Scanner scr=new Scanner(System.in);
     n=scr.nextInt();
      for(i=0;i<n;i++)
        {
         for(j=0;j<=n-i;j++)
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