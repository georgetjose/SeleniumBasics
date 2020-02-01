package week1.day1;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Automation Class $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] mychar = test.toCharArray();
		for (int i = 0; i < mychar.length; i++) 
		{
			
			if(Character.isLetter(mychar[i]))
				letter++;
			else if(Character.isSpaceChar(mychar[i]))
				space++;
			else if(Character.isDigit(mychar[i]))
				num++;
			else 
				specialChar++;			
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
