package replacement;

import java.util.*;

public class replacement {

	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int c=0;
		while(n!=1) {
		if(n%2==0)
		{
			n=n/2;	
		}
		else
		{
			n=n+1;
		}
		c++;
		}
		System.out.print(c);
	}
	}
