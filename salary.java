//a company an employee is paid as under: If his basic salary is less than Rs. 1500, then HRA 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 1500, then HRA Rs. 500 and DA 98% of basic salary
import java.util.Scanner;
class salary {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.print("Enter the basic salary: ");
double basicSalary=scanner.nextDouble();
double hra, da;
if (basicSalary < 1500) {
hra=0.10*basicSalary;
da=0.90*basicSalary;
}else {
hra = 500;
da=0.98*basicSalary;
}
double grossSalary = basicSalary + da + hra;
System.out.println("Gross Salary: " + grossSalary);
}
}