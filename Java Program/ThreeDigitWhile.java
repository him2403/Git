import java.util.*;
public class ThreeDigitWhile
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three digit number");
		int n = sc.nextInt();
		if (n>=100&&n<=999)
		{	int b;
			while(n>0)
			{
				b=n%10;
				n=n/10;
				System.out.println(b);
			}
		}
		else
		System.out.println("Number is not a three digit number, kindly enter three digit number.");
		
	}
}
		
		