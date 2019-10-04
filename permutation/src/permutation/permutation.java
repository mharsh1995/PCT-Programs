package permutation;

import java.util.*;
public class permutation {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		List<String> list=new ArrayList<>();
		List<String> list1=new ArrayList<>();
		for(int i=0;i<=str1.length();i++)
		{
			for(int j=i+1;j<=str1.length();j++)
			{
				String sub=str1.substring(i,j);
				list.add(sub);
			}
		}
		if(list.contains(str2))
		{
			System.out.print("\n"+"True");
		}
		else
		{
			System.out.print("\n"+"False");
		}
    }
}
