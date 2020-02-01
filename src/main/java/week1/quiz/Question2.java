package week1.quiz;

public class Question2 {

	public static void main(String[] args) 
	{
		String s = "Java Quiz";
		System.out.println(s.charAt(s.toUpperCase().length()));
		//Run time exception because of the array out of bound exception
		//Correct statement would be System.out.println(s.charAt(s.toUpperCase().length()-1)); 
	}

}
