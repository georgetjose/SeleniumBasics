package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int first=0, second=1, result;
		for(int i=0;i<100;i++)
		{
			result=first+second;
			if (result>100) break;
			System.out.println(result);
			first = second;
			second = result; 	
		}
	}

}
