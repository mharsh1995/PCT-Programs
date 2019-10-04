package stack;

import java.util.*;
public class stack {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		char[] ch=st.toCharArray();
		int count=0;
		int flag=0;
		
		Stack<Character> sta=new Stack<Character>();
		
		for(int i=0;i<ch.length;i++)
		{
		    char c=ch[i];
		
		if(c=='(')
		{
			sta.push('(');
			
		}
		else if(!sta.empty() && sta.peek()=='(')
		{
			sta.pop();
			flag=0;
		}
		
		else
		{
			System.out.print("false");
			flag=1;
		}
		
	}
		if(flag==0)
		{
			System.out.print("Match");
		}
		else
		{
			System.out.print("Not Match");
		}
  }
}
