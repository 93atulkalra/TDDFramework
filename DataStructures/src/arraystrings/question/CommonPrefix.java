package arraystrings.question;

/* WAP in O(1) and o(N) for finding common prefix in given array of strings
 *  String arr = {"apple","ape","april"}
 * 	Output ap
 * 
 * 
 * */
 

public class CommonPrefix {
	
	public  static String findPrefix(String[] inputArray) {
	
		String prefix=inputArray[0];
		
		if(!(inputArray.length<=0))
		{
			for(int i=1;i<inputArray.length;i++)
			{
				while(inputArray[i].indexOf(prefix)!=0)
				{
					prefix=prefix.substring(0, prefix.length()-1);
				}
				
			} // For ends
			
		
			
		}
		
		return prefix;
		
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"apple","ape","april"};
		
		String out = findPrefix(arr);
		if(out.length()>0)
		System.out.print("Prefix for the given set of string = > "+findPrefix(arr) );
		
		else
		System.out.print("No Prefix found");
				
		
	}

}

