package week5.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setExcelFile()
	{
		excelFile="TC001_CreateLead";
	}
	
	@Test(dataProvider="sendData")
	public void runCreateLead(String cName, String fName, String lName) {

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
	}
}
