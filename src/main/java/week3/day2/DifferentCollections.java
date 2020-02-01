package week3.day2;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DifferentCollections {

	public static void main(String[] args) 
	{
		List<Integer> myIntegers = new LinkedList<>();
		myIntegers.add(5);
		myIntegers.add(10);
		myIntegers.add(8);
		myIntegers.add(7);
		myIntegers.add(5);
		myIntegers.add(10);
		myIntegers.add(2);
		myIntegers.add(3);
		myIntegers.add(9);
		myIntegers.add(11);
		System.out.println(myIntegers.size());
		
		Set<Integer> myIntegersNoDuplicates = new LinkedHashSet<>();
		for(int i=0;i<myIntegers.size();i++)
		{
			if(!myIntegersNoDuplicates.add(myIntegers.get(i)))
				System.out.println(myIntegers.get(i));
		}
		

	}

}
