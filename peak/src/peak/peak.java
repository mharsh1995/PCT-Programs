package peak;

import java.util.*;
public class peak {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine().trim();
		String[] str=st.split("");
		
		int nums[]=new int[str.length];	   
	    for (int i = 0; i < nums.length - 1; i++) {
		            if (nums[i] > nums[i + 1])
		                System.out.print(i);         
		        }
		        System.out.print(nums.length - 1);
		    }
		}
	


