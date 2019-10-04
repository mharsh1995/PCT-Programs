package exam5;

import java.util.*;
public class exam5 {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();

		ArrayList<String> l1=new ArrayList<>();
		ArrayList<String> l2=new ArrayList<>();
		for(int i=0;i<str1.length();i++)
		{
			for(int j=i+1;j<str1.length();j++) {
				String sub1=str1.substring(i,j);
			    l1.add(sub1);
			}
		}
   System.out.print(l1);
   
   for(int i=0;i<str2.length();i++)
	{
		for(int j=i+1;j<str2.length();j++) {
			String sub2=str2.substring(i,j);
		    l2.add(sub2);
		}
	}
   
   System.out.print(l2);
    
	}
}