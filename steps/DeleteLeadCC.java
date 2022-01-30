package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadCC extends InitialClass
{
	
	@When("TC4-Click on Leads")
	public void clickOnLeads() 
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When("TC4-Click on Find Leads")
	public void findLeads() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("TC4-Click on First Name and enter {string}")
	public void clickName(String name) 
	{
		driver.findElement(By.xpath("//label[text()='First name:']//following::input[@name='firstName'][3]")).sendKeys(name);
	}
	
	@When("TC4-Click on Find Lead Button")
	public void findLeadButton() throws InterruptedException 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@When("TC4-Save First resulting field data Click it")
	public void firstResultingData() 
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@When("TC4-Click on Delete")
	public void delete() 
	{
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@When("TC4-Click again Find Leads")
	public void againFindLeads() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("TC4-Enter the name again {string}")
	public void enterTheNameAgain(String name) throws InterruptedException 
	{
		driver.findElement(By.xpath("//label[text()='First name:']//following::input[@name='firstName'][3]")).sendKeys(name);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@Then("Verify there is no records to display")
	public void verifyThereIsNoRecordsToDisplay() throws InterruptedException 
	{
		WebElement message = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		Thread.sleep(2000);
		String verifyMsg = message.getText();
		
		if(verifyMsg.contains("No records to display"))
			
				System.out.println("Verified the lead was deleted");
		else
				System.out.println("The Lead was not deleted");
	}
}
