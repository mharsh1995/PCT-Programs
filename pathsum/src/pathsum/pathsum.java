package pathsum;

import java.util.*;
public class pathsum {
	public static void main(String args[] )
	{
		Scanner scan=new Scanner(System.in);	
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		int[][] array=new int[m][n];
		int[][] array1=new int[array.length][array[0].length];
		
	    array[0][0]=array1[0][0];
			
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
		
		 for (int i = 1; i < n; i++) 
            array[0][i] = array[0][i - 1] + array1[0][i];  
			      for (int j = 1; j < m; j++)   
			             array[j][0] = array[j - 1][0] + array1[j][0]; 
		
		for (int i=1; i<m; i++){  
			  for (int j=1; j<n; j++){  
			    if(array[i-1][j]<array[i][j-1])
			        array[i][j]=array[i-1][j]+array1[i][j];
			            else
			               array[i][j]=array[i][j-1]+array1[i][j];
			                 }  
			           }  System.out.print(array[m-1][n-1]);           
		}
		
	}


