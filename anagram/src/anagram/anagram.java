package anagram;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class anagram {

	public static void main(String args[])
	
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=s.nextLine();
		String[] lines=str.split(" ");
		String[] lines1=str1.split(" ");
		
	    areana(lines,lines1);
	    
	    if(areana(lines,lines1))
	    	System.out.println("Anagram");
	    else
	    	System.out.println("Not Anagram");
	}


    public static boolean areana(String[] lines, String[] lines1)
    {
    	
    	int n1=lines.length;
    	int n2=lines1.length;
    	
		
    	Arrays.sort(lines);
    	Arrays.sort(lines1);
    	
    	for(int i=0;i<n1;i++)
    		if(lines[i]!=lines1[i])
    			return false;    	
    	return true;   	
    }
}
