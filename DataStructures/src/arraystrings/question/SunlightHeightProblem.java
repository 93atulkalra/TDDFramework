package arraystrings.question;


/*
 * 
 * Given an array representing heights of buildings. The array has buildings from left to right,
 *  count number of buildings facing the sunset. It is assumed that heights of all buildings are distinct.
 *  Input : array[] = {7, 4, 8, 2, 9}
	Output: 3
	Explanation: As 7 is the first element, it can 
	see the sunset.
	4 can't see the sunset as 7 is hiding it. 
	8 can see.
	2 can't see the sunset.
	9 also can see the sunset.

 */
public class SunlightHeightProblem {
	
	
	public static void main(String[] args) {
		int arr[] = {7, 4, 8, 2, 9};
		int currentmax =arr[0], count =1;
		
		for (int i=1;i<arr.length;i++)
		{
			
			if(arr[i]>=currentmax)
			{
				count++;
				currentmax=arr[i];
			}
		}
		
		
		System.out.println(count);
		
	}

}
