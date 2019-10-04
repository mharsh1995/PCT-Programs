package timestamp;

import java.util.*;
public class timestamp {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int sum1=0;
		for(int i=0;i<n;i++)
		{
			String str=scan.nextLine();
			String[] st=str.split(" ");
			int n1=Integer.parseInt(st[0]);
			int n2=Integer.parseInt(st[1]);
			int n3=Integer.parseInt(st[2]);
			
			if(n3==i)
			{
				sum=sum+n2;
			}
			else
			{
				sum1=sum-n2;
			}		
		}
	}
}
