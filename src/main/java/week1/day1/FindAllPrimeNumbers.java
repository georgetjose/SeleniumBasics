package week1.day1;

public class FindAllPrimeNumbers {

	public static void main(String[] args) {
		
		int range=100, count=0;
		for (int i = 2; i < range; i++) 
		{
			for (int j = 2; j <=(i/2); j++) 
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(i);
			else
				count=0;
		}
	}
}
