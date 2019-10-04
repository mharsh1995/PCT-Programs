//package decode;
//
//import java.util.*;
//public class decode {
//	public static void main(String args[])
//	{
//		Scanner scan=new Scanner(System.in);
//		String str=scan.nextLine();
//		int size = str.length();
//		int[] n=new int[size];
//		String sub;
//		
//		List<String> list=new ArrayList<>();
//		List<String> list1=new ArrayList<>();
//		
//		for(int i=0;i<=size;i++)	
//		{
//			for(int j=i+1;j<=size;j++)
//			{
//			   sub=str.substring(i,j);
//			   list.add(sub);
//			}
//	}
//     System.out.print("\n"+list);
//     System.out.print("\n"+list.size());
//}
//}

package decode;

import java.util.Scanner;

public class decode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        int score = 0;
        int PrevScore = 0;
        int FixedScore = 1;
        int lastvalue = 5;

        for (char c : s.toCharArray()) {
            int value = c - '0';
            if (value >= 1) {
                score = FixedScore;
            } else {
                score = 0;
            }
            if ((lastvalue == 1) || (lastvalue == 2 && value <= 6)) score += PrevScore;
            PrevScore = FixedScore;
            FixedScore = score;
            lastvalue = value;
        }

      System.out.println(score);

    }
}