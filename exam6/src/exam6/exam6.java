package exam6;

import java.util.Scanner;

public class exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int aagain , bagain , alast , blast;
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3[] = str1.split("\\s+");
		String str4[] = str2.split("\\s+");
		int a = Integer.parseInt(str3[0]);
		int b = Integer.parseInt(str3[1]);
		int c = Integer.parseInt(str4[0]);
		int d = Integer.parseInt(str4[1]);
		int sum1 = 0;
		int  sum2 = 0 ;
		int count1 = 0;
		int count2 = 0;
		
		for(int i=0;i<str1.length()/2;i++) {
			
		 aagain = a / 10;
		 bagain = b / 10;
		 alast = a % 10;
		 blast = b % 10;
//		 sum1 = 1 + alast + blast ;

		 
		 if(sum1 >= 10) {
			
			 count1 =  count1 + 1;
			 a = aagain;
			 b = bagain;
			 sum1 = 1 + alast + blast ;
		 }
	
		 else if ( sum1 < 10) {
			 a = aagain;
			 b = bagain;
			 sum1 = alast + blast;
		 }
		 
		 //System.out.println(sum1);
		 if(aagain == 0 && bagain == 0) {
			 if(sum1 >= 10) {
				 count1 = 1 + count1;
			 }
		 }
	}
		for(int i=0;i<str2.length()/2;i++) {
			 aagain = c / 10;
			 bagain = d / 10;
			 alast = c % 10;
			 blast = d % 10;
//			 sum2 = 1 + alast + blast ;
		
			  if(sum2 >= 10) {
				
				 count2 = count2 + 1;
				 
				 c = aagain;
				 d = bagain;
				 sum2 = 1 + alast + blast ;
				 }
			
			 else if ( sum2 < 10) {
				 c = aagain;
				 d = bagain;
				 sum2 =  alast + blast ;
			 }
			// System.out.println(sum2);
			 if(aagain == 0 && bagain == 0) {
				 if(sum2 >= 10) {
					 count2 = count2 + 1;
				 }
			 }
		}
		//System.out.println(count1);
		//System.out.println(count2);
		if(count1 == count2) {
			System.out.print("YES" + " " + count1);
		}
		else if ( count1 > count2) {
			System.out.print("NO" + " " + count1);
		}
		else if(count2 > count1){
			System.out.print("NO" + " " + count2);
		}
	}
}

