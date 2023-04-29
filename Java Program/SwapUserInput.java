import java.util.*;

public class SwapUserInput{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter the first number A = ");

int A = sc.nextInt();
System.out.print("Enter the second number B = ");

int B = sc.nextInt();
int C = A;
A = B;
B = C;

System.out.println("After Swapping A = " + A + " and B = " + B);
}
}