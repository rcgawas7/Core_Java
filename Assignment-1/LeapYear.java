import java.util.Scanner;

class LeapYear{
	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a year to check ");
	int y = sc.nextInt();
	if (y%4==0 )
{
	System.out.println("It is leap year" );
}
	else if( y%400==0)
{
	System.out.println("It is leap year"  );
}
	else if( y%100==0)
{
	System.out.println("It is leap year" );
}
	else 
{
	System.out.println("Not a leap year");

}

}
}








