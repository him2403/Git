import java.util.*;
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int i;
		System.out.print(a+","+b+",");
		for (i=0;i<=n;i++)
		{
		int c = a+b;
		System.out.print(c+",");
		a=b;
		b=c;
		}
		
		
	}
}