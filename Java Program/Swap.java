public class Swap{
public static void main(String[] args){
int A = 1;
int B = 2;

System.out.println("A = " + A + " and B = " + B);

int C = A;
A = B;
B = C;

System.out.println("After Swapping A = " + A + " and B = " + B);
}
}