package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadUsingXPath {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementByXPath("//label[text()='Username']/following-sibling::input").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//label[text()='Password']/following-sibling::input").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();
		driver.findElementByXPath("//div[@id='label']/a").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//span[text()='Company Name']/following::input[1]").sendKeys("Test_Company");
		driver.findElementByXPath("//span[text()='First name']/following::input[1]").sendKeys("Test_Firstname");
		driver.findElementByXPath("//span[text()='Last name']/following::input[1]").sendKeys("Test_Lastname");
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

	}

}
