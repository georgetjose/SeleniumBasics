package week1.day1;

public class Palindrome {

	public static void main(String[] args) 
	{
		String text = "madam";
		int count=0, i=0, j=0;
		char[] textchar = text.toCharArray();
		int len=textchar.length-1;
		for (j=0,i = len ; i >=0 && j <= len; j++, i--) 
		{
			if(textchar[j]!=textchar[i])
				count++;
		}
		if(count==0)
			System.out.println("The given string is a Palindrome!!");
		else
			System.out.println("The given string is not a Palindrome!!");

	}

}
