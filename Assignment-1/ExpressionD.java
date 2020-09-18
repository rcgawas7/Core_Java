import java.util.Scanner;

class ExpressionD{
	public static void main(String args[])
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter value of x as true or false");
	boolean i = sc.nextBoolean();
	System.out.println("Value of X = "+i);
	System.out.println("Enter value of y as true or false");
	boolean j =sc.nextBoolean();
	System.out.println("Value of Y = "+j);
	boolean k =i && j || !(i || j) ;
	System.out.println("Value of Z = "+k);
	
}
}