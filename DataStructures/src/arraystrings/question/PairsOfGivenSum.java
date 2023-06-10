package arraystrings.question;

import java.util.HashMap;
import java.util.LinkedList;

/*
 * Given an input  array [2,6,9,3,4,5,2] and sum k
 * Find all the pairs   with given sum [2,6], [6,2] and [5,3]
 * Create a hashMap with key as the array elements and its occurrence
 * Now Subtract given sum from the first element in the array 
 * Find the subtracted result in the map and if present that means we have a pair
 * 
 * 
 */
public class PairsOfGivenSum {
	
	public static void  findPairOfGivenSum(int[] arr ,int sum)
	{
		int count=0;
		HashMap<Integer,Integer> countMap = new HashMap<>();
		HashMap<String,Integer> output = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!countMap.containsKey(arr[i]))
			{
				countMap.put(arr[i],1);
			}
			
			else
				countMap.put(arr[i],(countMap.get(arr[i]))+1);
				
		} // for ends
		
		
		LinkedList<Integer> keyL = new LinkedList<>(countMap.keySet());
		for(int i=0;i<keyL.size();i++)
		{
			if(sum>keyL.get(i))
			{
				if(countMap.containsKey(sum-keyL.get(i)))
				{
					String temp = "Pair " + keyL.get(i) +" " + (sum-keyL.get(i));
					output.put( temp, 1 );
				
					
					
				}
			}
			
		} // for ends
		
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		
		int inputArr[] = {2,6,9,3,4,5,2};
		int sum =8;
		findPairOfGivenSum(inputArr, sum);
	}

}
