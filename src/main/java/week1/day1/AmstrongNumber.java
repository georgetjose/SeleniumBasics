package week1.day1;

public class AmstrongNumber {

	public static void main(String[] args) 
	{
		int input=153;
		int calculated=0, remainder, original;
		original = input;
		while(input>0)
		{
			remainder=input%10;
			calculated+=(remainder*remainder*remainder);
			input=input/10;
		}
		
		if(original==calculated) 
			System.out.println(original+" is an Amstrong number!!");
		else
			System.out.println(original+" is not an Amstrong number!!");

	}

}
