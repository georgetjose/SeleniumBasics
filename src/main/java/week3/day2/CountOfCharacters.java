package week3.day2;

public class CountOfCharacters {

	public static void main(String[] args) 
	{
    	String s ="Please focus";
		char[] myChar = s.toCharArray();
		int count=0; 
		for(int i=0;i<myChar.length;i++)
		{   
			count=0;
			for (int j = 0; j < myChar.length-1; j++) 
			{
				if(myChar[i]==myChar[j])
					count++;
			}
			System.out.println(myChar[i]+"="+count);
		}		 

	}

}
