package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("src").sendKeys("Chennai");
		Thread.sleep(1500);
		driver.findElementById("src").sendKeys(Keys.TAB);
		Thread.sleep(1500);
		driver.findElementById("dest").sendKeys("Trichy");
		Thread.sleep(1500);
		driver.findElementById("dest").sendKeys(Keys.TAB);
		Thread.sleep(1500);
		driver.findElementByXPath("(//td[@class='current day'])[2]").click();
		driver.findElementById("onward_cal").sendKeys(Keys.TAB);
		Thread.sleep(1500);
		driver.findElementByXPath("(//td[@class='current day'])[2]").click();
		Thread.sleep(1500);
		driver.findElementByXPath("//button[text()='Search Buses']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//label[@for='dtAfter 6 pm'])[2]").click();
		driver.findElementByXPath("(//label[@for='bt_AC'])[2]").click();
		Thread.sleep(1500);
		System.out.println(driver.findElementByXPath("//span[@class='f-bold busFound']").getText());
		driver.close();

	}

}
