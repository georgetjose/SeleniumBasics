package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/frame.html");
		
		//Click inside Frame
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[@id='Click']").click();
		
		//Click inside nested frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[@id='Click1']").click();
		
		//Count number of frames
		int count=0, total;
		driver.switchTo().defaultContent();
		List<WebElement> frames = driver.findElementsByTagName("iframe");
		for(int i=0;i<frames.size();i++)
		{
			driver.switchTo().frame(i);
			List<WebElement> innerframes = driver.findElementsByTagName("iframe");
			count=count+innerframes.size();
			driver.switchTo().defaultContent();
		}
		total=frames.size()+count;
		System.out.println("The total number of frames in this page is: "+total);

	}

}
