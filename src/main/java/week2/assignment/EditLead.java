package week2.assignment;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws Exception 
	{	
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
		driver.findElementByXPath("(//label[text()='First name:'])[3]/following::input[1]").sendKeys("Test");
		driver.findElementByXPath("(//label[text()='First name:'])[3]/following::button[1]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//tbody)[20]/tr[1]/td[1]/div/a").click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("View Lead | opentaps CRM"))
			System.out.println("Verified the Title!!");
		driver.findElementByXPath("//a[text()='Edit']").click();
		Random random = new Random();
		int rnum=random.nextInt(999);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("CompanyTest"+rnum);
		driver.findElementByXPath("//*[@value='Update']").click();
		if(driver.findElementById("viewLead_companyName_sp").getText().contains("CompanyTest"+rnum))
			System.out.println("Company Name updation verified!! \nUpdated Company Name is: "+"CompanyTest"+rnum);
		driver.close();
	}

}
