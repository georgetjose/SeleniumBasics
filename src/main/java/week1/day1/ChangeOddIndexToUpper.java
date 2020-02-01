package week1.day1;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) 
	{
		String test = "changeme"; 
		int j=0;
		char[] testchar = test.toCharArray();
		for(int i=0;i<testchar.length;i++)
		{
			j=i+1;
			if(j%2==0)
				testchar[i]=Character.toUpperCase(testchar[i]);
			System.out.print(testchar[i]);
		}
		
	}

}
