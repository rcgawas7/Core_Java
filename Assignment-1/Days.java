import java.util.Scanner;

class Days{
	public static void main(String args[])
{
	int year, month , days;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of days:");
	int NoOfDays = sc.nextInt();
	year = NoOfDays / 365;
	NoOfDays = NoOfDays -(365*year);
	month = NoOfDays / 30;
	days = NoOfDays - (month*30);
	System.out.println("Year:"+year + "    Months:"+ month + "     Days:"+days);


}
}