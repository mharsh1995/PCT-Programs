package maxstudent;

import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class maxstudent {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int sum=0;
		for(int i=0;i<N;i++)
		{	
			int n=scan.nextInt();
			String ip=scan.nextLine();
				
			if(ip=="i")
			{
				sum=sum+n;
			}
			else if(ip=="o")
			{
				sum=sum-n;
			}
		}
		System.out.print(sum);	
	}
}
