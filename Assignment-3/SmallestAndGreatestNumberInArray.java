class SmallestAndGreatestNumberInArray{
	
	public static void main(String args[]){
		int number[] = {1,5,8,6,7};
		int greatest = number[0];
		int smallest = number[0];
		
		for(int i=0; i<number.length; i++)
		{
			if(number[i] > greatest)
				greatest = number[i];
			else if(number[i] < smallest)
				smallest = number[i];
		}
		System.out.println("Greatest element =" + greatest);
		System.out.println("Smallest element =" + smallest);
	}
}