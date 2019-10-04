import java.util.Scanner;
import java.util.*;
public class Search {

	public static void main(String args[] )
	{
		Scanner scan=new Scanner(System.in);	
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		int[][] array=new int[m][n];
		int[][] array1=new int[array.length][array[0].length];
			
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	
		for (int i=0; i<array.length; i++){  
			  for (int j=0; j<array.length; j++){  
				  
				  array1[i][j] += array[i][j];
				  
				  
				  if(i>0 && j>0) {
					  
					  array1[i][j] = Math.min(array[i-1][j], array[i][j-1]);
					  
				  }
				  else if(i>0)
				  {
					  array1[i][j] += array[i-1][j];
					  
				  
				  }
			
				  else if(j>0)
				  {
					  array1[i][j] +=  array[i][j-1];
					  
				  
				  }
				  
				  
			  }
			  
			  
			  
			  }
		
		
		
		    System.out.println(array1[array1.length-1][array1[0].length-1]);
		
		
		
		
		
		
		
		
	}
	
	
}
