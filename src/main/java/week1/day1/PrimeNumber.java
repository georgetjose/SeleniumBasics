package week1.day1;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int input=67, count=0;
		int halfinput = input/2;
		for (int i = 2; i <=halfinput; i++) 
		{
			if(input%i==0) 
			{
				count++;
				break;
			}		
		}
		if(count>0)
			System.out.println("The Given input "+input+" is not a Prime number!!");
		else
			System.out.println("The Given input "+input+" is a Prime number!!");
	}
}
