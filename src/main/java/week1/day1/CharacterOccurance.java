package week1.day1;

public class CharacterOccurance {

	public static void main(String[] args) 
	{
		String test = "I am getting better with Java";
		char ch = 't';
		int totalCount = 0;
		
		char[] mychar = test.toCharArray();
		for (int i = 0; i < mychar.length; i++) 
		{
			if(mychar[i]==ch)
				totalCount++;
		}
		System.out.println(totalCount);

	}

}
