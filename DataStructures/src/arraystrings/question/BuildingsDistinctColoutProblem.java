package arraystrings.question;

/*
 * Given an integer K   and two integer arrays H[] and C[] of size K   where H[] stores the height of consecutive buildings and C[] stores the color codes for those building in which they are painted. 
The task is to determine how many colors are visible at once from the view on the right i.e. right of the rightmost building.
Examples: 
 

Input: K = 5, H[] = {5, 4, 3, 2, 3}, C[] = {1, 2, 3, 4, 5} 
Output: 3 
 * 
 * 
 * 
 */
public class BuildingsDistinctColoutProblem {

	public static void main(String[] args) {
		
		int height[] = {5, 4, 3, 2, 3};
		int colour[] = {1, 2, 3, 4, 5} ;
		int currentmax =height[height.length-1], count =1;
		
		int j =height.length-1;
		for (int i=height.length-1;i>=0;i--)
		{
			
			if(height[i]>currentmax  )
			{
				if(colour[i]!=colour[j]) {
				count++;
				j=i;
				currentmax=height[i];
				}
			}
		}
		
		System.out.println(count);
		
		
	}
}
