package week1.day1;

public class ReverseStr {

	public static void main(String[] args) {
		String test = "feeling good";
		char[] mychar = test.toCharArray();
		for (int i = mychar.length-1; i >=0 ; i--) 
		{
			System.out.print(mychar[i]);
		}

	}

}
