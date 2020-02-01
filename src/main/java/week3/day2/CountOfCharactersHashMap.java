package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharactersHashMap {

	public static void main(String[] args) 
	{
		String s ="Please focus";
		char[] myChar = s.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(char c : myChar)
		{
			if(!map.containsKey(c))
				map.put(c,1);
			else
				map.put(c,map.get(c)+1);			
		}
		System.out.println(map);

	}

}
