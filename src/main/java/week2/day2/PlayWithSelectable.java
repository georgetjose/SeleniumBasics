package week2.day2;


import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PlayWithSelectable {

	public static void main(String[] args) 
	{
		System.out.println("\u001b[1;30m");
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		System.out.println("\u001b[0m");
		driver.get("http://leafground.com/pages/selectable.html");
		//driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		for (int i = 1; i <= 7; i++) 
		{
			if(i%2!=0)
				builder.keyDown(Keys.CONTROL)
					   .click(driver.findElementByXPath("(//ol[@id='selectable']/li)["+i+"]"))
					   .release()
					   .perform();
		}	
		System.out.println("Hello!!!!");
	}

}
