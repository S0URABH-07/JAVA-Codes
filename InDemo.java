class Demo
{
void m1()
{
System.out.println("Hello indore");
}
class DD
{
void m2()
{
System.out.println("HI India");
}
}
}
class InDemo
{
public static void main(String args[])
{
Demo d1=new Demo();
d1.m1();
Demo.DD d2=d1.new DD();
d2.m2();

}
}