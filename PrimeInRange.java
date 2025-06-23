// Print all prime numbers between two given numbers
import java.util.Scanner;
public class PrimeInRange {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the starting number: ");
int start = sc.nextInt();
System.out.print("Enter the ending number: ");
int end = sc.nextInt();
System.out.println("Prime numbers between " + start + " and " + end + " are:");
for (int i = start; i <= end; i++) {
if (isPrime(i)) {
System.out.print(i + " ");
}}
sc.close();}
public static boolean isPrime(int num) {
if (num <= 1)
return false;
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0)
return false;
}
return true;
}}
