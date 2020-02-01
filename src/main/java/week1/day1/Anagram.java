package week1.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stop";
		String text2 = "pots";
		boolean ambigram=true;
		
		if(text1.length()==text2.length())
		{
			char[] text1chars=text1.toCharArray();
			char[] text2chars=text2.toCharArray();
			Arrays.sort(text1chars);
			Arrays.sort(text2chars);
			for(int i=0;i<text1chars.length;i++)
			{
				if(text1chars[i]!=text2chars[i])
					ambigram=false;					
			}
			if(ambigram)
				System.out.println("The given String "+text1+" and "+text2+" is an Anagram!!");
		}
		else
			ambigram=false;
		if(!ambigram)
			System.err.println("The given String "+text1+" and "+text2+" is not an Anagram!!");
	}

}
