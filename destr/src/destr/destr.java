package destr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class destr {
	public static void main(String args[]) throws ParseException {
		
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
	    
		for(int i=0;i<N;i++)
		{
			String str=scan.nextLine();
			String[] st=str.split("\\s+");
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
			Date dt=dateFormat.parse(st[0]);
			
			int n=Integer.parseInt(st[1]);
			
		}
	}
}
