//Accept person age(int), gender(int 1 for male and 0 for female), then check whether person is eligible for marriage or not.
import java.util.Scanner;
class Marriage {
public static void main(String[] args) {
Scanner in= new Scanner(System.in);
System.out.println("Enter person's age: ");
int age=in.nextInt();
System.out.println(" person's gen (1 for male, o for female): " );
int gender = in.nextInt();
boolean isEligible=Eligibility(age, gender);
if (isEligible) {
System.out.println("Person is eligible.");
} else {
System.out.println("Person is not eligible.");}}
public static boolean Eligibility(int age, int gender) {
int maleMarriageAge = 21;
int femaleMarriageAge = 18;
if (gender == 1) {
return age >= maleMarriageAge;
} else if (gender == 0) {
return age >= femaleMarriageAge;
} else {
System.out.println("Invalid gender input.");
return false;
}}}