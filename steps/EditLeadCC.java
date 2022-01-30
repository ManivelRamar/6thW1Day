package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadCC extends InitialClass
{
	@When("TC3-Click on Leads")
	public void tc3ClickOnLeads() 
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When("TC3-Click on Find Leads")
	public void tc3ClickOnFindLeads() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("TC3-Click on First Name and enter {string}")
	public void tc3ClickOnFirstNameAndEnter(String fName) 
	{
		driver.findElement(By.xpath("//label[text()='First name:']//following::input[@name='firstName'][3]")).sendKeys(fName);
	}
	
	@When("TC3-Click on Find Lead Button")
	public void tc3ClickOnFindLeadButton() throws InterruptedException 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@When("TC3-Click on First resulting field")
	public void tc3ClickOnFirstResultingField() 
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@When("TC3-Click on Edit")
	public void tc3ClickOnEdit() 
	{
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Then("TC3-Update Company name as {string}")
	public void tc3UpdateCompanyNameAs(String company) 
	{
		WebElement newCompany = driver.findElement(By.id("updateLeadForm_companyName"));
		newCompany.clear();
		newCompany.sendKeys(company);
	}
	
	@When("TC3-Click on Submit")
	public void tc3ClickOnSubmit() 
	{
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Check the company name get updated")
	public void checkTheCompName() 
	{
		String updatedCompany = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(updatedCompany.contains("CTS"))
			System.out.println("The company name updated successfully");
		else
			System.out.println("The company name not updated");
	}
}
