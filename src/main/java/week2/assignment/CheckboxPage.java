package week2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPage 
{

ChromeDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		CheckboxPage check = new CheckboxPage();
		check.launchBrowser();
		check.activity1();
		check.activity2();
		check.activity3();
		check.activity4();
		Thread.sleep(10000);
		check.closeBrowser();
	}
	
	public void launchBrowser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/checkbox.html");
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void activity1()
	{
	  List<WebElement> options = driver.findElements(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input"));
	  for (WebElement eachoption : options) {
		  eachoption.click();
	  }
	  System.out.println("Activity 1: Completed.");
	}
	
	public void activity2()
	{
		WebElement selCheckbox = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input"));
		//System.out.println("The output-->"+myChoice.getAttribute("innerHTML"));
		
	    if(selCheckbox.getAttribute("checked")!=null)
			 System.out.println("Activity 2: Confirmed that Selenium option is checked.");
		else
			System.out.println("Activity 2: Confirmed that Selenium option is not checked.");
		
	}
	
	public void activity3()
	{
		List<WebElement> checkBoxOptions = driver.findElements(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input"));
		for(int i=0;i<checkBoxOptions.size();i++)
		{
				if(checkBoxOptions.get(i).getAttribute("checked")!=null)
				{
					System.out.println("Activity 3: DeSelecting the checked option");
					checkBoxOptions.get(i).click();
				}
		}
	}
	
	public void activity4()
	{
		List<WebElement> options = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input"));
		  for (WebElement eachoption : options) {
			  eachoption.click();
		  }
		  System.out.println("Activity 4: Completed.");
	}

}
