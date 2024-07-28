package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefin {
	WebDriver driver;
	
	@Given("user is already in login page")
	public void user_is_already_in_login_page() {
	   driver=new ChromeDriver();
	   driver.get("https://ui.cogmento.com/");
	}

	@When("title of login page is Cogmento CRM")
	public void title_of_login_page_is_free_crm() {
	   String title = driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals(title, "Cogmento CRM","passed");
	}

	@Then("user enters username as {string} and pswrd as {string}")
	public void user_enters_username_as_and_pswrd_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(string);
	    driver.findElement(By.xpath("//input[@ame='password']")).sendKeys(string2);
	}   
	

	@Then("user click on loginBtn")
	public void user_click_on_login_btn() {
	    driver.findElement(By.xpath("//div[text()='Login']")).click();
	}





}
