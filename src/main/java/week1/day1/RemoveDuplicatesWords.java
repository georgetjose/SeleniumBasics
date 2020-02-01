package week1.day1;

public class RemoveDuplicatesWords {

	public static void main(String[] args) 
	{
		String text = "We learnt java basics as part of java sessions in week1";
		int count = 0, i,j;
		String[] textwords = text.split(" ");
		for(i=0;i<textwords.length;i++)
		{
			count=0;
			for(j=0;j<textwords.length;j++)
			{
					if(textwords[j].equals(textwords[i]))
						count++;
			}	
			if(count>1)
				System.out.print("");
			else	
				System.out.print(textwords[i]+" ");
		}

	}
}
