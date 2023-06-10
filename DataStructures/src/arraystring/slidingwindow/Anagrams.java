package arraystring.slidingwindow;

import java.util.HashMap;
import java.util.LinkedList;

public class Anagrams {
	
	public static boolean isAnagram(HashMap windowMp)
	{
		boolean anagram=true;
		LinkedList<Integer> listV = new LinkedList(windowMp.values());
		
		for(int i=0;i<listV.size();i++)
		{
			if(listV.get(i)==0)
				anagram=true;
			else
			{
				anagram=false;
				break;
			}
		}
		return anagram;
	}
 public static void main(String[] args) {
	
	 
	 String inputString = "forxxorfxdofr";
	 String anagram="for";
	 int k = anagram.length();
	 HashMap<Character, Integer> baseMap = new HashMap();
	
	 
	 
	 baseMap.put('f', 1);
	 baseMap.put('o', 1);
	 baseMap.put('r', 1);
	 int start=0, end=0;
	
	 while(end<inputString.length())
	 {
	
		if(anagram.contains(Character.toString(inputString.charAt(end))))
			 baseMap.put(inputString.charAt(end), baseMap.get(inputString.charAt(end)) - 1 );
		 

		 if(end-start+1<k)
			{ 
				//If window size not achieved yet , that means window is less than desired
				end++;
				
			}
			
			else if(end-start+1 == k)
			{
				boolean check = isAnagram(baseMap);
				if(check)
				{
					System.out.println(start + " " + end);
				}
				if(anagram.contains(Character.toString(inputString.charAt(start))))
			baseMap.put(inputString.charAt(start), baseMap.get(inputString.charAt(start)) +1);
	
				start++;
				end ++;
			}
			
			 
		 
	 }
}
}
