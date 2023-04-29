import java.util.*;
public class EvenOddSwitch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int A = sc.nextInt();
		int B = A%2;
		switch(B)
		{
		case 0: System.out.println("Entered number is even number");break;
		case 1: System.out.println("Entered number is odd number");break;
		default: System.out.println("Entered number is not an integer");
	
		}
	}
}
