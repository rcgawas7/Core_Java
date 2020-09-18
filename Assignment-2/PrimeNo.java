import java.util.Scanner;

class PrimeNo{
	public static void main (String args[])
{
	int b, flag = 0;
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no.");
	int a = sc.nextInt();
	b= a/2;
	if ((a==0)||(a==1))
{
	System.out.println("It is not a prime no");
}
	 else
{
	for(int i=2;i<=b;i++)
	{
	if (a%i==0)
{
	System.out.println("It is not prime no");
	flag = 1;
	break;
}	

}


}
	
{
	if(flag==0){System.out.println("It is prime no.");}

}

}


}