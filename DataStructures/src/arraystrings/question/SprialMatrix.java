package arraystrings.question;

public class SprialMatrix {
	
	public static void main(String[] args) {
		
		int input[][] ={{1,    2,   3,   4},{5,    6,   7,   8},{9,   10,  11,  12},{13,  14,  15,  16 }};
		
		int row=input.length;
		int col = input[0].length;
		int size = row*col;
		int minRow=0;
		int minCol=0;
		int maxRow=input.length-1;
		int maxCol = input[0].length-1;
		int count =0;
		while(count<size)
		{
			//left wall
			for(int i=minRow,j=minCol;i<=maxRow && count<size ;i++)
			{
				System.out.print(" "+input[i][j]);	
				count++;
			}
			
			minCol++;
			
			
			//bottom wall
			for(int i=maxRow,j=minCol;j<=maxCol && count<size ;j++)
			{
				System.out.print(" "+input[i][j]);		
				count++;
			}
			maxRow--;
			
			//right wall
			for(int i=maxRow,j=maxCol;i>=minRow  && count<size ;i--)
			{
				System.out.print(" "+input[i][j]);	
				count++;
			}
			
			maxCol--;
			// top wall
			for(int i=minRow,j=maxCol;j>=minCol&& count<size  ;j--)
			{
				System.out.print(" "+ input[i][j]);	
				count++;
			}
			
			minRow++;
			
			

			
			
		}
	
	
	
	}

}
