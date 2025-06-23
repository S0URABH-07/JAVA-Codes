import java.util.Scanner;
class NLoop5
{
    public static void main(String args[])
    {
      int i,j,k,n;
      char p;
      Scanner scr=new Scanner(System.in);
      n=scr.nextInt();
       for (i=0;i<n;i++)
         {
             for(k=0;k<n-i;k++)
                {
                 System.out.print("");
                }
                 p='A';

                  for(j=0;j<=i;j++)
                    {
                    System.out.print(p);
                    }
                 System.out.print("\n");
         }
    }
}