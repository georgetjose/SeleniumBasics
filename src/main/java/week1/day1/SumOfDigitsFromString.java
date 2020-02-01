package week1.day1;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0, num=0;
		char[] textchar = text.toCharArray();
		for (int i = 0; i < textchar.length; i++) 
		{
			if(Character.isDigit(textchar[i]))
			{
				System.out.println(textchar[i]);
				num =Character.getNumericValue(textchar[i]);
				sum+=num;
			}
		} 
		System.out.println("The Sum is "+sum);
	}

}
