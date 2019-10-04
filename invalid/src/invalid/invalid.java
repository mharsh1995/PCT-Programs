package invalid;

import java.util.*;
public class invalid {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String[] st=str.split("\\s+");	
		List<String> list=new ArrayList<>();
		for(int i=0;i<st.length;i++) 
		{	
		  list.add(st[i]);
		}	
		int diff=(Integer.parseInt(list.get(5))-Integer.parseInt(list.get(1)));	
	    if(Integer.parseInt(list.get(2))>1000 || Integer.parseInt(list.get(6))>1000)
		{
			System.out.print(list.get(4)+" "+list.get(5)+" "+list.get(6)+" "+list.get(7));
		}	    
	    else 
		{
			System.out.print(list);
		}
	}
}
