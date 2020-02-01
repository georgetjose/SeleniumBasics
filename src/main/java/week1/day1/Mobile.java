package week1.day1;

public class Mobile {
	
	boolean isAndroid = true;
	String mobileBrand = "Motorola";
	int variants = 123456;
	
	public void takeSnap()
	{
		System.out.println("The Picture is taken!!");
	}
	
	public void addNumber(long mobNumber)
	{
		System.out.println("The mobile number "+mobNumber+" is added successfully");
	}
	
	public void addNumber(String name, long mobNumber)
	{
		System.out.println("Contact added successfully!!");
	}
	
	public long searchNumber(String name)
	{
		System.out.print("The number for "+name+" is:");
		return 9600311812L;
	}

}
