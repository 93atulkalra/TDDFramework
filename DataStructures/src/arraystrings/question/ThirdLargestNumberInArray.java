package arraystrings.question;

public class ThirdLargestNumberInArray {
	
	public static void main(String[] args) {
		int arr[] = {1,5,98,53,9,6,77};
		
		int first =arr[0],second = Integer.MIN_VALUE,third = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				third=second;
				second=first;
				first=arr[i];
			}
			
			else if(arr[i]>second)
			{
				third=second;
				second=arr[i];
			}
			
			else if (arr[i] > third)
					third =arr[i];
			
		} //loop ends
	System.out.println("" + first + " " + second + " " + third);
	
	}

}
