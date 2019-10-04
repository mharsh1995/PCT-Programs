package temp;
import java.util.*;
public class temp {
	public static void main(String args[])
	{
		 Scanner scan=new Scanner(System.in);
		 String str=scan.nextLine();
		 int n=str.length();
		 int sum=0;
		 int flag=0;
		 for(char c : str.toCharArray())
		 {
		     if(c>='A' && c<='Z')
		     {
		    	 sum=sum+27+c - 'A';
		     }
		     else
		    	 sum=sum+1+c -'a';
		 } 
		 for(int i=2;i<sum;i++)
		 {
			 if(sum%i==0)
			 {
				 flag=0;
			 }
			 else
			 {
				 flag=1;
			 }
		 }
		 
		 if(flag==0)
		 {
			 System.out.print("NOT PRIME");
		 }
		 else
		 {
			 System.out.print("PRIME");
		 }
    }
}