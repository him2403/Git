import java.util.*;
public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int Yr = sc.nextInt();
		if (Yr%4==0)
		System.out.println("Entered year is Leap Year");
		else
		System.out.println("Entered year is not a Leap Year");
		
		
	}

}