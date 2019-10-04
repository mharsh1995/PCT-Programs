package shiftletter;

import java.util.*;
public class shiftletter {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char[] ch=new char[str.length()];
		String str2=scan.nextLine();
		String[] st2=str2.split("\\s+");
		int[] a=new int[st2.length];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(st2[i]);
		}
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
		     list.add(a[i]);
		}
		
		//System.out.print(list);
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<list.size();j++)
			{
			    ch[i]=(char) ((char)(str.charAt(i))+list.get(i));	
		    }
		}
		for(int i=0;i<ch.length;i++)
		System.out.print(ch[i]);
		
//		long x;
//		
//		x = ('a' % 26);
//		for(int i=list.size()-1;i>=0;i--)
//		{
//			ch[i] = (char) ((ch[i] + (x += a[i])) % 26 + 'a');
//		}
//		System.out.print(ch);
	}
}
