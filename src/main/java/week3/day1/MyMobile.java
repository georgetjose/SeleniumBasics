package week3.day1;

public class MyMobile {

	public static void main(String[] args) 
	{
		Samsung sam = new Samsung();
		Iphone ip = new Iphone();
		sam.callPhone();
		sam.useGps();
		ip.sendMesssage();
		ip.sendMesssage("Message1");
		ip.sendMesssage("Message1", "Message2");

	}

}
