package vowel;

import java.util.*;

public class vowel {
	public static void main(String args[]) {
		
		int count=0;
	 	Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		char[] ch=st.toCharArray();
		
			for(int i=0;i<=st.length();i+=2) {
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
			{
				System.out.println("Valid String");
			}
			else
				System.out.println("Invalid String");
	}
}
}
