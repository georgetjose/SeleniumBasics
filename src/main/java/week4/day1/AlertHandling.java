package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Alert.html");
		
		
		//Alert Box
		driver.findElementByXPath("//button[@onclick='normalAlert()']").click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//Confirmation Box - Cancel
		driver.findElementByXPath("//button[@onclick='confirmAlert()']").click();
		System.out.println(alert.getText());
		alert.dismiss();
		System.out.println(driver.findElementByXPath("//p[@id='result']").getText());
		
		//Confirmation Box - Ok
		driver.findElementByXPath("//button[@onclick='confirmAlert()']").click();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.findElementByXPath("//p[@id='result']").getText());
		
		//Prompt Box
		driver.findElementByXPath("//button[@onclick='confirmPrompt()']").click();
		alert.sendKeys("Stanford");
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.findElementByXPath("//p[@id='result1']").getText());
		
		//Line-Breaks
		driver.findElementByXPath("//button[@onclick='lineBreaks()']").click();
		System.out.println(alert.getText());
		alert.accept();
		
		//Sweet Alert
		driver.findElementByXPath("//button[@onclick='sweetalert()']").click();
		Thread.sleep(3000);
		System.out.println(driver.findElementByXPath("//button[@class='swal-button swal-button--confirm']").getText());
		driver.findElementByXPath("//button[@class='swal-button swal-button--confirm']").click();
	}

}
