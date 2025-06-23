//write a program to convert fahrenite to celsius
import java.util.Scanner;
class converter {
public static void main(String[] Strings) {
Scanner in = new Scanner(System.in);
System.out.print("Input a degree in Fahrenheit: ");
double fahrenheit = in.nextDouble();
double celsius =((5 *(fahrenheit-32.0)) / 9.0);
System.out.println(fahrenheit + "degree Fahrenheit is equal to " +celsius +" in Celsius");
}
}