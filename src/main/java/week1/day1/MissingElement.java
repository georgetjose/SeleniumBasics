package week1.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] data = {3,2,4,6,7,8,11};
		//2,3,4,6,7,8
		Arrays.sort(data);
		int num=data[0];
		for(int i=0;i<data.length;i++)
		{
			if(data[i]!=num)
			{	
				System.out.println("Missing number is: "+num);
				num++;
			}
			num++;
		}

	}

}
