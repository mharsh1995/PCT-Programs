package mapped;

import java.util.*;
public class mapped {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine().toUpperCase();
		String str2=scan.nextLine().toUpperCase();
		
		List<Character> list1=new ArrayList<>();
		List<Character> list2=new ArrayList<>();
		
		for(char ch1 : str1.toCharArray())
		{
			ch1++;
			list1.add(ch1);
		}	
		Collections.sort(list1);
		System.out.print(list1);
		
		for(char ch2 : str2.toCharArray())
		{
			list2.add(ch2);	
		}	
		Collections.sort(list2);
		System.out.print("\n"+list2);
		
		           if(list1.equals(list2))
		        		   
		              {
			              System.out.print("\n"+"MAPPED");
		              }
		           else
		              {
			              System.out.print("\n"+"NOT MAPPED");
		              }
	}
}
