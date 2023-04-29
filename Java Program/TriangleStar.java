import java.util.*;
public class TriangleStar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		for(int j=n-i;j>=0;j--)
		{System.out.print("*");
		}
		System.out.println(" ");
		}
		
	}
}