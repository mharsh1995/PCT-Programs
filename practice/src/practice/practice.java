package practice;

import java.util.*;
public class practice {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		String[] str=st.split("\\s+");
		
		
		String ans="";
		
		for(int i=str.length-1;i>=0;i--)
		{
			ans=ans+str[i]+" ";
		}
		
		System.out.print(ans.substring(0,ans.length()-1));
	}
}
