package arraystrings.question;

/* Given an array with positive and negative integers. WAP to move zero to end
 * Input array = [11,-2, 3,4,0,5,3,0,37,9,0];
 * output =  [11,-2, 3,4,5,3,37,9,0,0,0];
 * 
 * 1. Make two counters i,j staring both of them by 0
 * 2. Swap for non-zero items 
 */

public class MoveZeroToEnd {
	
	
	
	public static void moveTOEnd(int[] arr)
	{
		int j=0,temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
				
			} // if ends
			
		}// for ends
		
		
		
		
	}// function moveTOEnd finishes
	public static void main(String[] args) {
		
		int[] input = {11,-2, 3,4,0,5,3,0,37,9,0};
		
		if(input.length==0)
		{
			System.out.println("Empty Array");
		}
		else
		{
			moveTOEnd(input);
			System.out.print("Outout Array is => " );
			for(int inputI :input)
				System.out.print(inputI+" " );
		}
				
		
	
	}  // Main ends

}
