import java.util.*;
public class PositiveNegative
	{
	public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number A = ");
		int A = sc.nextInt();
		
		if (A>0)
		System.out.print("Given Number is Positive");
		
		else if (A<0)
		System.out.print("Given Number is Negative");
		
		else 
		System.out.print("Given Number is Zero");
		
		
		}
	}