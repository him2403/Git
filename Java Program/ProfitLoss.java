import java.util.*;
public class ProfitLoss
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cost Price i.e. CP");
		int CP = sc.nextInt();
		System.out.println("Enter the Selling Price i.e. SP");
		int SP = sc.nextInt();
		if (SP>CP)
		System.out.println("Transaction is in profit");
		else if (SP<CP)
		System.out.println("Transaction is in loss");
		else
		System.out.println("Transaction is in no profit and no loss");
		
		
		
	}
}