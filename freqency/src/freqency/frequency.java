package freqency;

import java.util.*;

public class frequency {
	public static void main(String args[]) {
		
		int count=0,a;
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		String x="";
		String array[]=new String[n];
		
		
			while(n>0)
			{
				a = n % 2;
	            if(a == 1)
	            {
	                count++;
	            }
	            x = a+x;
	            n = n / 2;

			
			System.out.println(x);		
		}
	}
		
		
}

		
		
		
		
		
		
		

	   