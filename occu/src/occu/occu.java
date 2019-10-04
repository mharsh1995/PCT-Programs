package occu;

import java.util.Scanner;

public class occu {

	public static void main(String args[])
	
	{
		int charindex=0;
		Scanner sc=new Scanner(System.in); 
		String c=sc.nextLine();
		//String[] tokens=c.split(" ");
		
		for(int i=0;i<c.length();i++)
		{ 
			if(c.charAt(i)=='a')
			{
				charindex++;
			}
		}
		System.out.println(charindex);
		
	}
}
