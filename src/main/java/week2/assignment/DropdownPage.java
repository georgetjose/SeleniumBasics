package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

ChromeDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		DropdownPage drop = new DropdownPage();
		drop.launchBrowser();
		drop.activity1();
		drop.activity2();
		drop.activity3();
		drop.activity4();
		drop.activity5();
		drop.activity6();
		Thread.sleep(10000);
		drop.closeBrowser();
	}
	
	public void launchBrowser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Dropdown.html");
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void activity1()
	{
		Select dropdown = new Select(driver.findElementById("dropdown1"));
		dropdown.selectByIndex(2);
	}
	
	public void activity2()
	{
		Select dropdown = new Select(driver.findElementByName("dropdown2"));
		dropdown.selectByVisibleText("Selenium");
	}
	
	public void activity3()
	{
		Select dropdown = new Select(driver.findElementById("dropdown3"));
		dropdown.selectByValue("3");
	}
	
	public void activity4()
	{
		Select dropdown = new Select(driver.findElementByClassName("dropdown"));
		System.out.println("The total number of Options in fourth dropdown is: "+dropdown.getOptions().size());
	}
	
	public void activity5()
	{
		driver.findElementByXPath("(//select)[5]").sendKeys("Loadrunner");
	}
	
	public void activity6() throws Exception
	{
		Select listbox = new Select(driver.findElementByXPath("//select[@multiple]"));
		listbox.selectByVisibleText("Selenium");
		listbox.selectByVisibleText("UFT/QTP");
	}
	

}
