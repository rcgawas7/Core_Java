 import java.util.Scanner;

class ReverseNo{
	public static void main(String args[])
{
	int a=0;
	int reverse = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	 a = sc.nextInt();
	
	while(a!=0)

{
	reverse = reverse*10;
	reverse = reverse + a%10;
	a = a/10;
	
}
	System.out.println("Reverse of input no is :" + reverse);
	

}

}