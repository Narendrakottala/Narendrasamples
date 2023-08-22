package hdfcbill;
public class total {
	public static void main(String[] args) {
		int b=25000,dep=15000,tf=11000;
		double cb,interest;
		cb=b+dep-tf;
		interest=cb*0.02*12;
		System.out.println("cb= "+cb +" interest= "+interest);
	}
}
