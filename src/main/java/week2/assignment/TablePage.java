package week2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePage 
{
ChromeDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		TablePage tab = new TablePage();
		tab.launchBrowser();
		tab.activity1();
		tab.activity2();
		tab.activity3();
		tab.activity4();
		Thread.sleep(10000);
		tab.closeBrowser();
	}
	
	public void launchBrowser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/table.html");
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void activity1()
	{
	  WebElement table = driver.findElementById("table_id");
	  List<WebElement> allrows = table.findElements(By.tagName("tr"));
	  List<WebElement> allheadings = allrows.get(0).findElements(By.tagName("th"));
	  System.out.println("The number of columns :"+ allheadings.size());
	}
	
	public void activity2()
	{
		WebElement table = driver.findElementById("table_id");
	    List<WebElement> allrows = table.findElements(By.tagName("tr"));
		System.out.println("The number of rows(including the heading) :"+ allrows.size());  
	}
	
	public void activity3()
	{
		WebElement table = driver.findElementById("table_id");
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		  for(int i=1;i<allrows.size();i++)
		  {
			  List<WebElement> allcolumns = allrows.get(i).findElements(By.tagName("td"));
			  if(allcolumns.get(0).getText().equals("Learn to interact with Elements"))
					  System.out.println("The Progress value of 'Learn to interact with Elements': "+allcolumns.get(1).getText());
		  }
	  
	}
	
	public void activity4()
	{
		WebElement table = driver.findElementById("table_id");
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		List<WebElement> allcolumns = allrows.get(0).findElements(By.tagName("td"));
		int lowPercentage =0, lowPercentageIndex=0; 
		int size=allrows.size()-1;
		String[] progress = new String[size];
		int[] result = new int[size];
		  
		for(int i=1;i<allrows.size();i++)
		{
			allcolumns = allrows.get(i).findElements(By.tagName("td"));
			progress[i-1] = allcolumns.get(1).getText();
			progress[i-1] = progress[i-1].replace("%", "");
			result[i-1] = Integer.parseInt(progress[i-1]);
		 }
		  
		 for(int j=0;j<allrows.size()-2;j++)
		 {
			if(result[j]<result[j+1])
			{
				lowPercentage = result[j];
				lowPercentageIndex = j;
			}
		  }
		  lowPercentageIndex++;
		  System.out.println("lowPercentage:"+lowPercentage);
		  System.out.println("lowPercentageIndex:"+lowPercentageIndex);
		  driver.findElementByXPath("(//input[@type='checkbox'])["+lowPercentageIndex+"]").click();
	}
	
}
