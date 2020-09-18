import java.util.Scanner;

class ExpressionC{
	public static void main(String args[])
{
	Scanner sc = new Scanner (System.in);
	//System.out.println("Enter value of x");
	int i = sc.nextInt();
	System.out.println("Value of X = "+i);
	//System.out.println("Enter value of y");
	int j =sc.nextInt();
	System.out.println("Value of Y = "+j);
	int k = (i++) - (--j) - (--i) + (i++);
	System.out.println("Value of Z = "+k);
	
}
}