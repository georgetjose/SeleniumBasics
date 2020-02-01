package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("@");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String firstName = driver.findElementByXPath("(//tbody)[20]/tr[1]/td[3]/div/a").getText();
		driver.findElementByXPath("(//tbody)[20]/tr[1]/td[3]/div/a").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Duplicate Lead | opentaps CRM"))
			System.out.println("Verified the Title!!");
		driver.findElementByClassName("smallSubmit").click();
		String newFirstName = driver.findElementById("viewLead_firstName_sp").getText();
		if(firstName.equals(newFirstName))
			System.out.println("Verified that the new record that got created is also having the same name!!");
		driver.close();

	}

}
