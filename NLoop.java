import java.util.Scanner;
class NLoop
{
          public static void main(String args[])
          {
           int i,j,k,n;
              for (i=0;i<10;i++)
                 { 
                     for(k=0;k<10-i;k++)
                        {
                        System.out.print(" ");
                        }
                          for(j=0;j<=i;j++)
                              {
                              System.out.print("*");
                              }
                              System.out.print("\n");
                 }
           }
}