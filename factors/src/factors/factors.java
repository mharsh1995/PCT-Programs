package factors;

import java.util.*;
public class factors {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		List<Integer> list=new ArrayList<>();
		
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(i%2!=0)
				{
					list.add(i);
					
				}
			}
			
		}
		
		System.out.print(list);
		
		sum=0;
		for(int j=0;j<list.size();j++)
		{
			sum=sum+list.get(j);
		}
		System.out.print("\n"+sum);		
	}
}
