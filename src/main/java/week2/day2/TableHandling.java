package week2.day2;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("CSTM",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		
		WebElement trainTable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		List<WebElement> allRows = trainTable.findElements(By.tagName("tr"));
		for(int i=0;i<allRows.size();i++)
		{
			List<WebElement> allColumns = allRows.get(i).findElements(By.tagName("td"));
			WebElement trainNumber = allColumns.get(0);
			System.out.println(trainNumber.getText());
		}
		

	}

}
