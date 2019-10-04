package pct5;

import java.util.*;

public class pct5 {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine().trim().replaceAll("\\s+", "").trim().toLowerCase();
		//String str2=s.nextLine().trim().replaceAll("\\s+", "").trim().toLowerCase();
		
		List<String> hs1=new ArrayList<>();
		//List<String> hs2=new ArrayList<>();
		
		int count=0;
		
		hs1.add(str1);
	//	hs2.add(str2);
		
		System.out.print(hs1);
		//System.out.print(hs2);
		
		int n=str1.length();
		
		for(int i=0;i<=n;i++)
		{
			if(str1==hs1.get(i))
			{
				count++;
				
			}
		}
		System.out.print(count);
	}

}
