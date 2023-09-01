package lab3;
class Bankcustomer
{
	int acno;
	String actype;
	int amt;
	Bankcustomer()
	{
		acno=10;
		actype="saving";
		amt=1000;
	}
	Bankcustomer(int x,String y, int z)
	{
		acno=x;
		actype=y;
		amt=z;
	}
	void show()
	{
		System.out.println("acno= "+acno+" actype= "+actype+" amt= "+amt);
	}
}
public class overloading {

	public static void main(String[] args) {
		Bankcustomer b = new Bankcustomer();
		Bankcustomer c = new Bankcustomer(100,"saving",10000);
		b.show();
		c.show();
		// TODO Auto-generated method stub

	}

}
