package factorial;

import java.util.*;
public class factorial {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		int[][] ip=new int[m][n];
		int count=0;
		
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
			System.out.println("");
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(ip[i][j]==0) {
					continue;
				}
				else if(ip[i][j]==1) {
					count++;
				    continue;
				}
				else {
					break;
				}
			}
		}
		System.out.print(count);
	}

}
