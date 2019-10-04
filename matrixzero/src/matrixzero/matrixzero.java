package matrixzero;

import java.util.*;
public class matrixzero {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		int [][] ip=new int[m][n];
		
		Set<Integer> R= new HashSet<Integer>();
		Set<Integer> C= new HashSet<Integer>(); 
		
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
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(ip[i][j]==0)
				{
					R.add(i);
					C.add(j);
				}
			}
		}
	 
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(R.contains(i) ||  C.contains(j))
				{
					ip[i][j]=0;
				}
			}
	
		}
		
		System.out.println("\t");
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
