package lab4;
class Hello
{
	int eid,eid1;
	Hello(int x)
	{
		eid=x;
	}
	public String toString()
	{
		return eid+" ";
	}
}
public class String3 {
	public static void main(String[] args) {
		Hello h1 = new Hello(10);
		Hello h2 = new Hello(13);
		System.out.println(h1.equals(h2));
		System.out.println(h1==h2);
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h1.getClass());
		System.out.println(h2.getClass());
		
		// TODO Auto-generated method stub

	}

}
