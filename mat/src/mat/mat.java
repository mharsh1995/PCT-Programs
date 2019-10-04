package mat;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class mat {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");
		String s2=scan.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
			
		Arrays.sort(c1);
		Arrays.sort(c2);

		boolean result=Arrays.equals(c1, c2);		
		if(result)
				{
					System.out.println("Yes");
				}
				else
				{
					System.out.print("No");
				}
	}
}
