package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLeadCC extends InitialClass
{
	
	@When("Click on leads button")
	public void clickOnLeadsButton() 
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When("Click on Find Leads button")
	public void findLeadsButton() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("Click on First Name as {string}")
	public void firstName(String firstName) 
	{
		driver.findElement(By.xpath("//label[text()='First name:']//following::input[@name='firstName'][3]")).sendKeys(firstName);
	}
	
	@When("Click on Find Lead to get results")
	public void findLead() throws InterruptedException 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@Then("Click on First result and get FirstName")
	public void clickOnFirstResult() 
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
	}
	
	@When("Click on Duplicate")
	public void clickOnDuplicate() 
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	
	@When("Click Submit to duplicate the lead")
	public void clickSubmit() 
	{
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Check and confirm the Duplicate Lead")
	public void checkLead() 
	{
		String leadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(leadName.contains("Manivel"))
		{
			System.out.println("The Lead has duplicated");
		}
		else
		{
			System.out.println("Lead not get duplicated");
		}
	}

}
