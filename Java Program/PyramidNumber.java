import java.util.*;
public class PyramidNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int k=0;
		
		for(int i=1;i<=n;i++)
		{
		for(int j=n-i;j>=0;j--)
		{System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{System.out.print(k+" ");
		
		k++;
		}
		System.out.println(" ");
		}
	}
}