package arraystrings.question;

/* Given an array with positive and negative integers. WAP to move zero to end
 * Input array = [11,-2, 3,4,0,5,3,0,37,9,0];
 * output =  [11,-2, 3,4,5,3,37,9,0,0,0];
 */

public class MoveZeroToEnd {
	
	public static void moveTOEnd(int[] arr)
	{
		
		
		
	}
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
