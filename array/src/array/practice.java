package array;

import java.util.*;

public class practice {
	public static void main(String args[])
	{
		int sum=0,times=0;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		times=(int) Math.pow(2,n-1);
        for(int i=0;i<n;i++)
        {
        	 a[i]=scan.nextInt();
        	 sum=sum+(a[i]*times);
        	 
        }
        System.out.print(sum);
	}

}
