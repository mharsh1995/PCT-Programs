package decimal;

import java.util.*;

public class decimal {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int input=Integer.parseInt(str,2);
		
		int N=scan.nextInt();
		//int counter=0,ans = 0;
		//int Answer;
		//int base=1;
//		while(input!=0)
//		{
//			Answer = input % 10; 
//            input = input / 10; 
//  
//            ans += Answer * base; 
//  
//            base = base * 2;
//            
//            
//        } 
		
	System.out.print(input);
	
	if(N==input)
	{
		System.out.print("\nYes");
	}
	else
	{
		System.out.print("\nNo");
	}
}
}