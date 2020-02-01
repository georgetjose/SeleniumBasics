package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[@class='_1QZ6fC _3Lgyp8'] [text()='Electronics']").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Mi").click();
		Thread.sleep(2000);
		System.out.println(driver.findElementByXPath("//h1[@class='_2yAnYN']").getText());
		if(driver.findElementByXPath("//h1[@class='_2yAnYN']").getText().equals("Mi Mobiles"))
			System.out.println("Text is verified");
		else
			System.err.println("The Text is wrongly displayed");
		List<WebElement> allPhones = driver.findElementsByXPath("//div[@class='_3wU53n']");
		for(WebElement eachMobile:allPhones )
		{
			System.out.println(eachMobile.getText());
		}
		
		driver.close();
		
		

	}

}
