// without using static keyword 
class staDemo
{
int x;
public static void main (String args[])
{
staDemo d1=new staDemo();
staDemo d2=new staDemo();
staDemo d3=new staDemo();
d1.x=1000;
d2.x=2000;
d3.x=3000;
System.out.println(d1.x);
System.out.println(d2.x);
System.out.println(d3.x);
}
}
