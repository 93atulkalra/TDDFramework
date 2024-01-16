package arraystrings.question;

import java.util.Arrays;

/*
Given two integers A and C, the task is to check if there exists a permutation of the number A such that the sum of the number A and its permutation is equal to C.

Examples:

Input: A = 133, C = 446
Output: Yes
Explanation: One of the permutation of A is 313. Therefore, sum = 133 + 313 = 446, which is equal to C.

Input: A = 200, C = 201
Output: No
*/

public class PermutationNumberDifferenc {
	
	public static void main(String[] args) {
		int a=133,b=446;
		int diff = b-a;
		String FirstEquivalent = Integer.valueOf(a).toString();
		String diffEquivalent = Integer.valueOf(a).toString();
		
		char FirstEquivalentArr[] =  FirstEquivalent.toCharArray();
		char diffEquivalentArr[] =  diffEquivalent.toCharArray();
		Arrays.sort(FirstEquivalentArr);
		Arrays.sort(diffEquivalentArr);
		Arrays.equals(FirstEquivalentArr, diffEquivalentArr);
		
		for(int i =0;i<FirstEquivalentArr.length;i++)
		{
			System.out.print(FirstEquivalentArr[i]);
		}
		
		System.out.println("");
		
		for(int i =0;i<diffEquivalentArr.length;i++)
		{
			System.out.print(diffEquivalentArr[i]);
		}
		
		
		
		
		
		
		
		
	}

}
