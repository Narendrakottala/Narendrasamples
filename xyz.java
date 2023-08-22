package total;
import java.util.Scanner;
public class xyz {
   public static void main(String[] args) {
	   int salary;
	   System.out.println("Enter Salary: ");
	   Scanner sc = new Scanner(System.in);
	   salary = sc.nextInt();
	   double dr,hra,pf,gross;
	   dr=0.12*salary;
	   hra=0.13*salary;
	   pf=0.15*salary;
	   gross=salary-dr-hra-pf;
	   System.out.println("dr="+dr + " hra= "+hra + " pf= "+pf + " gross= "+gross);
   }
}
