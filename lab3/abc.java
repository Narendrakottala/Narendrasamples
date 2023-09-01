package lab3;
class Person
{
	int pid;
	String pname;
	Person()
	{
		pid=25;
		pname="suresh";
	}
}
class Student extends Person
{
	int marks;
	Student()
	{
		marks=100;
	}
	void display()
	{
		System.out.println(" marks= "+marks);
	}
}
class Emp extends Person
{
	int salary;
	Emp()
	{
		salary=10000;
	}
    void show()
    {
	System.out.print("pid= "+pid+" pname= "+pname+" salary= "+salary );
	}

}


public class abc {

	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.show();// TODO Auto-generated method stub
        Student s1=new Student();
        s1.display();
	}
		// TODO Auto-generated method stub

	}


