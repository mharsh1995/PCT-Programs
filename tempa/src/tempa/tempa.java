package tempa;

import java.util.*;
public class tempa {
       public static void main(String args[])
       {
    	   Scanner scan=new Scanner(System.in);
    	   int n=scan.nextInt();
    	   scan.nextLine();
    	   
    	   ArrayList<Integer> list=new ArrayList<>();
    	   ArrayList<Integer> list1=new ArrayList<>();
    	   
    	   for(int a=0;a<n;a++)
    	   {
    		   int m=scan.nextInt();
        	   list.add(m);    
    	   }   
    	   int count=0;
    	   System.out.println(list);
    	   int x=list.size();
    	   for(int i=0;i<x-2;i++)
    	   {
    		   for(int j=i;j<x-1;j++)
    		   {
    			   if(list.get(i)<list.get(j))
    			   {
    				   list1.add(1);
    				   continue;
    			   }   
    			   else if(list.get(i)>list.get(j))
    			   {
    				  while(!(list.get(i)<list.get(j)))
    				  {
    					    count++;
    					    j++;
    					    
    				  }	
    				  list1.add(count);
    				  continue;
    			   }
    			   else
    			   {
    				   list1.add(count);
    			   }
    		   }
    	   }
    	   list1.add(0);
    	 System.out.print(list1);
       }
}
