import java.util.Scanner;

class Series12{
	public static void main(String args[])
{
	int i, sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of n:");
	int n = sc.nextInt();
	n = (n*10+2);

	for(i=12;i<=n;i=i+10)
{
	System.out.print(i);
	if(i<n)
	System.out.print("+");
	sum = sum + i;
}
System.out.print("\n Sum is : " + sum);
}

}