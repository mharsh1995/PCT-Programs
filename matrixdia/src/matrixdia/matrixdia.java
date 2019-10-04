package matrixdia;

import java.util.*;
public class matrixdia {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		int [][] ip=new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				ip[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ip[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
