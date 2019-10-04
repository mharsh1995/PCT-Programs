package substring;

import java.util.*;
public class substring {
	public static void main(String args[])
	{
		int count=0;
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		int k=scan.nextInt();
		
		int MAX_CHARS = 100;
		int a[]=new int[MAX_CHARS];
		
		HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
		
		    char[] array=st.toCharArray();
		    
		    for(char c : array)
		    {
		    	if(hs.containsKey(c))
		    	{
		    		hs.put(c,hs.get(c)+1);
		    	}
		    	else
		    		hs.put(c, 1);
		    }
		    System.out.println(hs);
		    
		    int n=st.length();
		    for(int i=0;i<n;i++)
		    {
		    	a[st.charAt(i) - 'a']++;
		    }
	 
		    for(int i=0;i<n;i++)
		    {
		    	if(a[st.charAt(i) - 'a']>=k)
		    	{
		    		System.out.println(st.charAt(i));
		    	}
		    
//	   if(a[i]==st.charAt(i))
//	   {
//		   count++;
//	   }
	//System.out.print(count);
		    }     
}
}