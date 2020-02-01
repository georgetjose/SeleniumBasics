package week3.day2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eRailWithLinkedList {

	public static void main(String[] args) throws Exception 
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
		List<String> firstNames = new LinkedList<>();
		List<String> secondNames = new LinkedList<>();
		for(int i=0;i<allRows.size();i++)
		{
			List<WebElement> allColumns = allRows.get(i).findElements(By.tagName("td"));
			WebElement trainName = allColumns.get(1);
			firstNames.add(trainName.getText());
		}
		System.out.println(firstNames);
		
		driver.findElementByXPath("//a[@title='Click here to sort on Train Name']").click();
		Thread.sleep(2000);
		
		WebElement trainTable1 = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> allRows1 = trainTable1.findElements(By.tagName("tr"));
		for(int i=0;i<allRows1.size();i++)
		{
			List<WebElement> allColumns1 = allRows1.get(i).findElements(By.tagName("td"));
			WebElement trainName1 = allColumns1.get(1);
			secondNames.add(trainName1.getText());
		}
		System.out.println(secondNames);
		
		int count=0;
		Collections.sort(firstNames);
		for(int j=0; j<firstNames.size();j++)
		{
			if(!firstNames.get(j).equals(secondNames.get(j)))
				count++;
		}
		System.out.println(firstNames);
		if(count==0)
			System.out.println("The Sorted Array is same!!");
		else
			System.out.println("The Sorted Array is not same!!");
		driver.close();
	}

}
