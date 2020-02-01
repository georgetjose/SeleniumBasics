package week1.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] testwords = test.split(" ");
		int i,j,arrayadjuster=0;
		for(i=0;i<testwords.length;i++)
		{
			arrayadjuster=i+1;
			if(arrayadjuster%2==0)
			{
				char[] testletters = testwords[i].toCharArray();
				for (j = testletters.length-1; j >=0 ; j--) 
				{
					System.out.print(testletters[j]);
				}
				System.out.print(" ");
			}
			else
				System.out.print(testwords[i]+" ");
		}

	}

}
