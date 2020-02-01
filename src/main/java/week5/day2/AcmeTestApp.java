package week5.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcmeTestApp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElementByXPath("(//button[@type='button'])[6]")).perform();
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		
		WebElement table = driver.findElementByXPath("//table");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> columns = rows.get(1).findElements(By.tagName("td"));
		WebElement column = columns.get(3);
		System.out.println("The Country Name is : "+column.getText());
		driver.close();
	}

}
