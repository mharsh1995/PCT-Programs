package sample1;

import java.util.*;
public class sample1 {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		
		int sum1=0;
		int sum2=0;
		
		for(char c : str1.toCharArray())
		{
			if(c>='a' && c<='z')
			{
				sum1=sum1+1+c-'a';
			}
			else
			{
				sum1=sum1+27+c-'A';
			}
		}
		System.out.print(sum1);
		for(char c1 : str2.toCharArray())
		{
			if(c1>='a' && c1<='z')
			{
				sum2=sum2+1+c1-'a';
			}
			else
			{
				sum2=sum2+27+c1-'A';
			}
		}
		System.out.print("\n"+sum2);
		
		String same ;
        int large ;

        if (sum1 > sum2)
        {
           same = str1 ;
           large =sum1;
        }
        else 
        {
           same = str2 ;
           large=sum2;
        }
        ArrayList<String> l1 = new ArrayList<String>();
        for (int i=0;i<=same.length();i++){
            for(int j=i+1;j<=same.length();j++){
                String sub1 = same.substring(i,j);
                l1.add(sub1);
            }
        }
        ArrayList<String> l2 = new ArrayList<String>();
        for (int i=0; i<l1.size();i++){
            int sum3 =0;
            String sub2 = l1.get(i);
            for (char c : sub2.toCharArray()){
                if (c>='a' && c<='z'){
                    sum3=sum3+1+c - 'a';
                }
                else 
                {
                    sum3=sum3+27+c - 'A';
                }
            }
            int diff1 = large -sum3;
            if (diff1 ==sum1 || diff1==sum2)
            {
               l2.add(sub2);
            }
        }
        System.out.println("\n"+l2);
    }
}
		
		



