package week4.day1;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	static ChromeDriver driver;
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		TakeScreenshot obj = new TakeScreenshot();
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.co.in/");
		obj.snap("01");
		driver.get("https://redbus.in/");
		obj.snap("02");
		driver.get("https://www.msn.com/en-in");
		obj.snap("03");
		driver.close();
	}
	
	public void snap(String num) throws IOException 
	{
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/snap"+num+".png");
		FileUtils.copyFile(src, dest);
	}

}
