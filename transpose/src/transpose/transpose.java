package transpose;

import java.util.*;
public class transpose {
		public static void main(String args[])
		{
			Scanner scan=new Scanner(System.in);
			int m=scan.nextInt();
			int n=scan.nextInt();
			
			int[][] ip=new int[m][n];
			int[][] ip1=new int[n][m];
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
					ip1[j][i]=ip[i][j];
				}
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					System.out.print(ip1[i][j]+"\t");
				}
				System.out.println();
			}
		}

	}
