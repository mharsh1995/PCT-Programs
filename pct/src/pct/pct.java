package pct;
import java.util.Scanner;

import javax.crypto.Mac;
public class pct {
	public static void main(String args[])
	{
		double angle;
		Scanner scan=new Scanner(System.in);
		double hour=scan.nextInt();
		double minu=scan.nextInt();
    
		if(hour>12 || hour<0 || minu>60 || minu<0)
		{
			System.out.print("false");
		}
		
		if(hour==12)
			hour=0;
		if(minu==60)
			minu=0;
			
		double houra=0.5 * (hour * 60 + minu);
		double mina=6 * minu;
		
	    angle=Math.abs(houra-mina);
	    angle=Math.min(360-angle,angle);
	    
	   System.out.print(angle);
	    
	}
}
