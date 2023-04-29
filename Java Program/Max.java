import java.util.*;

public class Max
	{
	public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int A = sc.nextInt();
		
		System.out.println("Enter the second number");
		
		int B = sc.nextInt();
		
		String C;
		C = (A>B)? ""+A:""+B;
		System.out.println("Maximum of two number is :"+C);
		
		}
	
	}