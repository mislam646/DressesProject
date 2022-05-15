package com.batch24.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.batch24.pages.Home24Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Home24Steps {
	WebDriver driver;
	Home24Page obj;

	@Given("^user go to Orange HRM home page for batch (\\d+)$")
	public void user_go_to_Orange_HRM_home_page_for_batch(int arg1) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj = new Home24Page(driver);
	}

	@When("^user type the username$")
	public void user_type_the_username() throws Throwable {
		
		obj.getUsername().sendKeys("Admin");
	}

	@When("^user also type password$")
	public void user_also_type_password() throws Throwable {
		//driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		obj.getPassword().sendKeys("admin123");
	}

	@Then("^user click on the Login button$")
	public void user_click_on_the_Login_button() throws Throwable {
		//driver.findElement(By.name("Submit")).click();
		obj.getLoginBtn().click();
	}

	@Then("^user verify the welcome screen$")
	public void user_verify_the_welcome_screen() throws Throwable {
		String expected = "Welcome";
		String actual = obj.getWelcomeTxt().getText();
		Assert.assertTrue("welcome message is not found",actual.contains(expected));
	}

}
