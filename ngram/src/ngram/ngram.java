package ngram;
import java.io.*;
import java.util.*;

public class ngram 
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		
		int l = sc1.nextInt();
		if(l == 0)
			return;
			
		sc1.nextLine();
		
		int unigram=0;
		int bigram=0;
		int trigram=0;
		int bt=0;
		
		String input="";
		for(int i=0; i<l;i++)
		{
			input += " " + sc1.nextLine();
		}
			
		int ngram = sc1.nextInt();

		if(ngram < 1 || ngram > 3)
			return;

		int[] uni;
		int[][] bi;
		int[][][] tri;

		StringTokenizer input1 =  new StringTokenizer(input," .,\\n\\r\\t");
		switch(ngram)
		{
			case 1:
					uni = new int[30];
					while(input1.hasMoreTokens())
					{
						String wd = input1.nextToken();
			
						for(int i=0;i<wd.length();i++)
						{
							uni[wd.charAt(i)-'a']++;
						}
					}
			
					for(int i=0;i<30;i++)
					{
						if(uni[i]>bt)
						{
							unigram = i;
							bt = uni[i];
						}
					}
					System.out.println("Unigram "+(char)(unigram+'a'));	
					break;

			case 2:
					bi = new int[30][30];
					while(input1.hasMoreTokens())
					{
						String wd = input1.nextToken();
			
						for(int i=1;i<wd.length();i++)
						{
							bi[wd.charAt(i-1)-'a'][wd.charAt(i)-'a']++;
						}
					}

					for(int i=0;i<30;i++)
					{
						for(int j=0;j<30;j++)
						{
							if(bi[i][j]>bt)
							{
								unigram = i;
								bigram = j;
								bt = bi[i][j];
							}
						}
					}
					System.out.println("Bigram "+(char)(unigram+'a')+(char)(bigram+'a'));
					break;

			case 3:
					tri = new int[30][30][30];

					while(input1.hasMoreTokens())
					{
						String wd = input1.nextToken();
			
						for(int i=2;i<wd.length();i++)
						{
							tri[wd.charAt(i-2)-'a'][wd.charAt(i-1)-'a'][wd.charAt(i)-'a']++;
						}
					}

					for(int i=0;i<30;i++)
					{
						for(int j=0;j<30;j++)
						{
							for(int k=0;k<30;k++)
							{
								if(tri[i][j][k]>bt)
								{
									unigram = i;
									bigram = j;
									trigram = k;
									bt = tri[i][j][k];
								}
							}
						}
					}
					System.out.println("Trigram "+(char)(unigram+'a')+(char)(bigram+'a')+(char)(trigram+'a'));
					break;		
		}
	}					
}