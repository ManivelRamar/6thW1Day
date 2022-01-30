package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadCC extends InitialClass
{
	@Given("Click on leads")
	public void clickLead()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	@Given("Click on Create Lead")
	public void clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Click on Company name and enter {string}")
	public void clickOnCompanyName(String company)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}
	@Given("Click on First name and enter {string}")
	public void clickOnFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	@Given("Click on Last name and enter {string}")
	public void clickOnLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	@When("Click on create lead button")
	public void clickOnCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("View Lead page shoud be displayed")
	public void viewLeadPage() {
		String title = driver.getTitle();
		
		if(title.contains("View Lead"))
		{
			System.out.println(" View Lead Page Loaded Successfully");
		}
		else
		{
			System.out.println("Page not get loaded as expected");
		}
	}
}
