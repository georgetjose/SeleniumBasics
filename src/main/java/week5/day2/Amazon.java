package week5.day2;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles");
		driver.findElementByXPath("(//input[@type='submit'])[1]").click();
		List<WebElement> allPrices = driver.findElementsByXPath("//span[@class='a-price']");
		System.out.println("Price of first mobile : "+allPrices.get(0).getText());
		driver.findElementByXPath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]").click();
		List<String> allWindows = new LinkedList<>();
		allWindows.addAll(driver.getWindowHandles());
		driver.switchTo().window(allWindows.get(1));
		driver.findElementById("add-to-cart-button").click();
		
		String capturedText = driver.findElementByXPath("//h1").getText();
		if(capturedText.contains("Added to Cart"))
			System.out.println("Added to cart and the Text also matched!!");
		else
			System.out.println("Added to cart Text is not matching!!");
		driver.findElementById("hlb-ptc-btn").click();
		String title = driver.getTitle();
		if(title.equals("Amazon Sign In"))
			System.out.println("Title of Amazon Login Page verified");
		else
			System.out.println("Title is not matching with the expected!!");
		
		driver.findElementById("continue").click();
		String alertText = driver.findElementByXPath("//div[@id='auth-email-missing-alert']/div/div").getText();
		
		if(alertText.contains("Enter your email or mobile phone number"))
			System.out.println("The alert Text is verified!!");
		else
			System.out.println("The Alert Text is not matching with the expected!!!");
		
		driver.quit();
		
	}

}
