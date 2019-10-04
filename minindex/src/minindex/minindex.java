package minindex;

import java.util.*;
public class minindex {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String[] st=str.split("");
		int[] N=new int[st.length];
		int len=st.length;
		int target=scan.nextInt();
		int n = 0;
		for(int i=0;i<len;i++)
		{
			N[i]=Integer.parseInt(st[i]);
		}
		List<Integer> list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		for(int i=0;i<N.length;i++)
		{
			list.add(N[i]);
		}
	
		for(int i1=0;i1<list.size();i1++)
		{
			if(list.get(i1).equals(target))
			{
				list1.add(i1);
			}
			}
		System.out.print("\n"+Collections.min(list1));
			}
}	
