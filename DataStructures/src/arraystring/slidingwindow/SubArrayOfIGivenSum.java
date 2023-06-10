package arraystring.slidingwindow;

public class SubArrayOfIGivenSum {

	public static void main(String[] args) {
		
		int arr[] = {4,1,1,1,2,3,5};
		int sum =5;
		int cursum=0;
		int i =0,j=0;
		while(j<arr.length)
		{
			cursum = cursum + arr[j];
			if(cursum<sum)
			j++;
			
			else	if(cursum==sum)
			{System.out.println("Sum pair met at" + i+ " "+ j + "index with value " + arr[i] +" " + arr[j]);
				j++;
			}
			else if(cursum>sum)
			{
				while(cursum>sum)
				{
					cursum=cursum - arr[i];
					i++;
					
				}
				
				if(cursum==sum)
				System.out.println("Sum pair met at" + i+ " "+ j + "index with value " + arr[i] +" " + arr[j]);
				
				
				j++;
				
				
			}
		}
	}
}
