package week1.day1;

public class Mymobile {

	public static void main(String[] args) 
	{
		Mobile mymob = new Mobile();
		boolean isAndroid = mymob.isAndroid;
		String mobileBrand = mymob.mobileBrand;
		int variants = mymob.variants;
		System.out.println(isAndroid);
		System.out.println(mobileBrand);
		System.out.println(variants);
		
		mymob.takeSnap();
		mymob.addNumber(9600311812L);
		mymob.addNumber("George",9600311812L);
		System.out.println(mymob.searchNumber("George"));
	}
	
}
