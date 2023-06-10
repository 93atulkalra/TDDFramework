package arraystring.slidingwindow;

/*
 * Given an array [2,5,1,8,2,9,1]
 * Find the largest sum sub-array of window K
 * 2 5 1
 * 5 1 8
 * 1 8 2
 * 8 2 9
 * 2 9 1
 * 
 * sliding window algorithm 
 * 
 * 
 */
public class LargestSumSubArrayOfWindow {
	
	public static void largestSumSubArray(int[] arr,int k)
	{
		int start =0, end=0;
		int sum=0,maxSum=0;;
		
		
		while(end<arr.length)
		{
			
			sum = sum + arr[end];
			// We do calculation related to end
			if(end-start+1<k)
			{ 
				//If window size not achieved yet , that means window is less than desired
				end++;
				
			}
			
			else if(end-start+1 == k)
			{
				maxSum =Math.max(sum,maxSum);
				sum = sum - arr[start];
				start++;
				end ++;
			}
			
			
				
		} // while ends
		
		System.out.println(maxSum);
		
	}
	
	public static void main(String[] args) {
		
		int inputArray[] = {2,5,1,8,2,9,1};
		int windowSize=3;
		largestSumSubArray(inputArray,windowSize);
		
	}

}
