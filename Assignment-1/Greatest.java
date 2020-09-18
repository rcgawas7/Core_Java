import java.util.Scanner;

class Greatest{
	public static void main(String args[])
{
	//int n1,n2,n3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Three numbers");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();

	if(n1>n2 && n1>n3)
{
	System.out.println(n1+" is greatest" );
}
	else if(n1<n2 && n3<n2)
{
	System.out.println(n2+" is greatest" );
}
	else
{
	System.out.println(n3+" is greatest" );
}

}
}