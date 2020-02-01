package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Test_Company");
		driver.findElementById("createLeadForm_firstName").sendKeys("Test_Firstname");
		driver.findElementById("createLeadForm_lastName").sendKeys("Test_Lastname");
		
		Select sourceDropdown = new Select (driver.findElement(By.id("createLeadForm_dataSourceId")));
		sourceDropdown.selectByVisibleText("Partner");
		
		Select marketingCampaignDropdown = new Select (driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		marketingCampaignDropdown.selectByValue("CATRQ_CARNDRIVER");
		
		Select industryDropdown = new Select (driver.findElement(By.id("createLeadForm_industryEnumId")));
		industryDropdown.selectByIndex(3);
		
		Select currencyDropdown = new Select (driver.findElement(By.id("createLeadForm_currencyUomId")));
		List<WebElement> currencyOptions = currencyDropdown.getOptions();
		int currencyOptionsSize = currencyOptions.size(); 
		currencyDropdown.selectByIndex(currencyOptionsSize-1);
		
		Select ownershipDropdown = new Select (driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		List<WebElement> ownershipOptions = ownershipDropdown.getOptions();
		for (WebElement eachElement : ownershipOptions) 
			System.out.println(eachElement.getText());
		
		driver.findElementByClassName("smallSubmit").click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

	}

}
