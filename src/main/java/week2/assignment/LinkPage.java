package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPage {

ChromeDriver driver = new ChromeDriver();
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		LinkPage link = new LinkPage();
		link.launchBrowser();
		link.activity1();
		link.activity2();
		link.activity3();
		link.activity4();
		link.activity5();
		link.closeBrowser();
	}
	
	public void launchBrowser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void activity1()
	{
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").click();
		String Homepage = "http://leafground.com/home.html";
		if(Homepage.equals(driver.getCurrentUrl()))
			System.out.println("Success!! HomePage Button works.");
		else
			System.err.println("Failed!! HomePage Button does not work.");
	}
	
	public void activity2()
	{
		driver.get("http://leafground.com/pages/Link.html");
		System.out.println("Redirection link: "+driver.findElementByXPath("(//a[@link='blue'])[2]").getAttribute("href"));		
	}
	
	public void activity3()
	{
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElementByXPath("(//a)[4]").click();
		if(driver.getTitle().equals("HTTP Status 404 – Not Found"))
			System.out.println("Broken Link!!!");
		else
			System.out.println("Not Broken Link!!!");
	}
	
	
	public void activity4()
	{
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();		
	}
	
	public void activity5()
	{
		driver.get("http://leafground.com/pages/Link.html");
		System.out.println("The total number of Links in this page is "+driver.findElements(By.xpath("//a")).size());		
	}

}
