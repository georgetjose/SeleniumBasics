package week3.day1;

public class Iphone extends Mobile
{
	public void sendMesssage(String s) 
	{
		System.out.println("sendMesssage: Sending iMessage !!");
	}
	
	public void sendMesssage(String string1,String string2) 
	{
		System.out.println("sendMesssage: Sending Whatsapp Message!! "+string1+" "+string2);
	}
}
