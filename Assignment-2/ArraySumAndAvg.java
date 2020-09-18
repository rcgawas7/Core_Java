import java.util.Scanner;

class ArraySumAndAvg
{
	public static void main(String args[])
{
	int sum=0;double avg = 0;
	Scanner sc = new Scanner (System.in);
	int ar[] = new int [10];
	for(int i=0;i<ar.length;i++)
{
	System.out.println("Enter element");
	ar[i] = sc.nextInt();

}
for (int i=0;i<ar.length;i++)
{
	sum= sum+i;
	 avg = (sum/10);


}
	System.out.println("Sum is:"+sum);
	System.out.println("Avg is:"+avg);

}

}