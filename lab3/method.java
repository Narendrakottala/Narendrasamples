package lab3;
import java.util.Scanner;
class student
{
	int sid;
	int marks;
	String sname;
	void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter sid:");
		sid=sc.nextInt();
		System.out.println("Enter marks:");
		marks=sc.nextInt();
		System.out.println("Enter sname:");
		sname=sc.next();
		

	}
	void output()
	{
		System.out.println("sid="+sid+" marks= "+marks+" sname= "+sname);
	}
}
public class method {

	public static void main(String[] args) {
		student s1= new student();
		s1.input();
		s1.output();// TODO Auto-generated method stub

	}

}
