package week5.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("(//div[text()='Popular Pick-up points']/following-sibling::div)[1]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		Thread.sleep(3000);
		
		Date date = new Date(); // Get the current date
		DateFormat sdf = new SimpleDateFormat("dd"); //Get only the date (and not month, year, time etc)
		String today = sdf.format(date); // Get today's date
		int tomorrow = Integer.parseInt(today)+1; // Convert to integer and add 1 to it
		
		String startDate = driver.findElementByXPath("//div[@class='day'][contains(text(),'"+tomorrow+"')]").getText();
		driver.findElementByXPath("//div[@class='day'][contains(text(),'"+tomorrow+"')]").click();
		
		driver.findElementByXPath("//button[text()='Next']").click();
		String startdate2 = driver.findElementByXPath("(//div[@class='label time-label'])[1]").getText().substring(4, 6);
		System.out.println(startdate2);
		if(startDate.contains(startdate2))
			System.out.println("Date is verified");
		else
			System.out.println("Date is not matching with the expected!!");
		driver.findElementByXPath("//button[text()='Done']").click();
		
		List<WebElement> totallistings = driver.findElements(By.xpath("//div[@class='car-listing']"));
		System.out.println("The total listings available : "+ totallistings.size());
		
		List<WebElement> priceFull = driver.findElements(By.xpath("//div[@class='price']"));
		List<String> priceTexts= new LinkedList<>();
		List<Integer> price= new LinkedList<>();
		int highest=0, highestIndex=0;
		for(int i=0;i<priceFull.size();i++)
		{
			priceTexts.add(priceFull.get(i).getText().trim().substring(2).replace(",", ""));
			price.add(Integer.parseInt(priceTexts.get(i)));
			System.out.println(price.get(i));
			if(highest<price.get(i))
			{
				highest=price.get(i);
				highestIndex=i;
			}
		}
		highestIndex++;
		String carname = driver.findElementByXPath("(//h3)["+highestIndex+"]").getText();
		System.out.println("The highest priced car is "+carname+" and the price for the same is Rs."+highest);
		System.out.println();
		driver.findElementByXPath("(//button[@name='book-now'])["+highestIndex+"]").click();
		driver.quit();
		
	}

}
