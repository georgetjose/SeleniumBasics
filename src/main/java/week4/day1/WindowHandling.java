package week4.day1;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Window.html");
		
		//Open Home Page
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		System.out.println(driver.getTitle());
		driver.findElementById("home").click();
		List<String> allWindows = new LinkedList<>();
		allWindows.addAll(driver.getWindowHandles());
		driver.switchTo().window(allWindows.get(1));
		System.out.println(allWindows.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		//Open Multiple Windows
		driver.switchTo().window(parentWindow);
		driver.findElementByXPath("//button[@onclick='openWindows()']").click();
		List<String> allWindows2 = new LinkedList<>();
		allWindows2.addAll(driver.getWindowHandles());
		System.out.println("The total number of Windows opened are: "+allWindows2.size());
		
		//Do not close me
		String firstWindow = allWindows2.get(1);
		String secondWindow = allWindows2.get(2);
		driver.switchTo().window(firstWindow);
		driver.close();
		driver.switchTo().window(secondWindow);
		driver.close();
		
		//Wait for 5 seconds
		driver.switchTo().window(parentWindow);
		driver.findElementByXPath("//button[@onclick='openWindowsWithWait();']").click();
		List<String> allWindows3 = new LinkedList<>();
		allWindows3.addAll(driver.getWindowHandles());
		System.out.println("The total number of Windows opened after 5 seconds are: "+allWindows3.size());
		driver.quit();
	}

}
