package expo;
import java.util.*;
public class expo {
	public static void main(String args[]) {	
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		List<String> list1=new ArrayList<>();
		for(int i=0;i<=str1.length();i++)
		{
			for(int j=i+1;j<=str1.length();j++) {
				String sub=str1.substring(i,j);
				list1.add(sub); }		
		}	
	    int ans = 1 ;
		for(int i=0;i<list1.size();i++)
		{
			String si=list1.get(i);
			int d1=str1.length()/si.length();
			String s = "";	
			for(int j=0;j<d1;j++)
			{	  
				s = s+si; 	   	   
			}
			if(s.equals(str1)) {		
				 ans = d1;
			}		
		}	
		System.out.println(ans);	
	}
}
