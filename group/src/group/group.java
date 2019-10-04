package group;

import java.util.ArrayList;
import java.util.Scanner;

public class group {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str1 = s.nextLine().trim().replaceAll("\\s+", "").trim();
		String str2 = s.nextLine().trim().replaceAll("\\s+", "").trim();
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> temp1 = new ArrayList<>();
		ArrayList<String> temp2 = new ArrayList<>();
		
		if(str1.isEmpty() && str2.isEmpty()) {
			System.out.print("YES " + 0);
			return;
		}	
		if(str1.isEmpty()) {			
			exponentiation(str2,list2,temp2);
			int n2 = Integer.parseInt(temp2.get(1));
			System.out.print("NO " + n2);
			return;
		}	
		if(str2.isEmpty()) {			
			exponentiation(str1,list1,temp1);
			int n1 = Integer.parseInt(temp1.get(1));
			System.out.print("NO " + n1);
			return;
		}			
			exponentiation(str1,list1,temp1);
			exponentiation(str2,list2,temp2);			
			int n1 = Integer.parseInt(temp1.get(1));
			int n2 = Integer.parseInt(temp2.get(1));		
			if(n1 == n2) {
				System.out.print("YES " + n1);
			}
			else {
				System.out.print("NO " + Math.max(n1, n2));
			}
		}

	private static void exponentiation(String str, ArrayList<String> list, ArrayList<String> temp) {
		int k=0;
		for(int j=1;j<=str.length()-k;j++) {
			String sub=str.substring(k,k+j);
			list.add(sub);
		}
		for(int i=0;i<list.size();i++) {
			String s="";
			for(int j=0;j<Math.floor(str.length()/list.get(i).length());j++) {
				s=s+list.get(i);				
				}	
			if(s.equals(str)) {
				temp.add(list.get(i));
				String n =String.valueOf(Math.floor(str.length()/list.get(i).length()));
				temp.add(n.substring(0, n.indexOf(".")));
				break;
			}
		}	
	}
}
		
		
