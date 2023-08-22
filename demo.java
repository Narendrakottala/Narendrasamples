package operators;
public class demo {
	public static void main(String[] args) {
		int x=10,y=15,z;
		z=x+y; //arithmetic operators
		System.out.println(z);
		y=z; //assignment operator
		z=x+y;
		System.out.println(z);
		x+=3;y-=4; //Multiple assignment operators
		System.out.println(""+x +" "+y);
		x++; ++y; z=x++; //Unary Operators
		System.out.println(""+x +" "+y +" "+z);
		
	}

}
