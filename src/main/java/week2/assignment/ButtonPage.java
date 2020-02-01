package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;


public class ButtonPage {
	
	ChromeDriver driver = new ChromeDriver();
	
	public static void main(String[] args) 
	{
		System.out.println("\u001b[30m");
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ButtonPage but = new ButtonPage();
		but.launchBrowser();
		but.activity1();
		but.activity2();
		but.activity3();
		but.activity4();
		but.closeBrowser();
	}
	
	public void launchBrowser()
	{
		System.out.println("\u001b[0m");
		driver.manage().window().maximize();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void activity1()
	{
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElementById("home").click();
		String Homepage = "http://leafground.com/home.html";
		if(Homepage.equals(driver.getCurrentUrl()))
			System.out.println("Success!! HomePage Button works.");
		else
			System.err.println("Failed!! HomePage Button does not work.");
	}
	
	public void activity2()
	{
		driver.get("http://leafground.com/pages/Button.html");
		System.out.println("Location of the 2nd button: "+driver.findElementById("position").getLocation());		
	}
	
	public void activity3()
	{
		driver.get("http://leafground.com/pages/Button.html");
		System.out.println("Color of the 3rd button: "+driver.findElementById("color").getAttribute("style"));		
	}
	
	
	public void activity4()
	{
		driver.get("http://leafground.com/pages/Button.html");
		System.out.println("Size of the 4th button: "+driver.findElementById("size").getSize());		
	}


}
