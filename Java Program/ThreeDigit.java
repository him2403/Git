import java.util.*;
public class ThreeDigit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three digit number");
		int n = sc.nextInt();
		if (n>=100&&n<=999)
		{	int b = n%10;
			int c =(n%100-2)/10;
			int d =n/100; 
			System.out.println(b*100+c*10+d);
		}
		else
		System.out.println("Number is not a three digit number, kindly enter three digit number.");
	}
}