package week2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPage {

ChromeDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		RadioButtonPage radio = new RadioButtonPage();
		radio.launchBrowser();
		radio.activity1();
		radio.activity2();
		radio.activity3();
		Thread.sleep(10000);
		radio.closeBrowser();
	}
	
	public void launchBrowser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/radio.html");
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void activity1()
	{
		driver.findElementByXPath("//label[text()='Are you enjoying the classes?']/following::input[1]").click();
	}
	
	public void activity2()
	{
		List<WebElement> radioOptions = driver.findElements(By.xpath("//label[text()='Find default selected radio button']/following-sibling::label/input"));
		List<WebElement> radioOptionsLabels = driver.findElements(By.xpath("//label[text()='Find default selected radio button']/following-sibling::label"));
		for(int i=0;i<radioOptions.size();i++)
		{
				if(radioOptions.get(i).getAttribute("checked")!=null)
					System.out.println("The default checked option in second choice is: "+radioOptionsLabels.get(i).getText());
		}
	}
	
	public void activity3()
	{
		WebElement myChoiceRadioButton = driver.findElement(By.xpath("//label[contains(text(),'Select your age group')]/following-sibling::input[2]"));
		//System.out.println("The output-->"+myChoice.getAttribute("innerHTML"));
		
	    if(myChoiceRadioButton.getAttribute("checked")!=null)
			 System.out.println("Already the option is selected, therefore not clicking the same");
		else
		{
			 System.out.println("The option is not selected, therefore clicking on the same");
			 myChoiceRadioButton.click();
		}
		
	}
	
}
