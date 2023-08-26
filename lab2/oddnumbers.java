package xyz;
import java.util.Scanner;
public class oddnumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
		a=a*2;
		for(i=0;i<=a;i++)
		{
		if(i%2==0)
			continue;
		{
			System.out.print(i+" ");
		}
		}

	}

	
}
