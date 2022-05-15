package com.batch24.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Practice24Page {
	WebDriver driver;
	
	public Practice24Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Dresses')])[5]")
	private WebElement dressesTab;

	public WebElement getDressesTab() {
		return dressesTab;
	}

	public void setDressesTab(WebElement dressesTab) {
		this.dressesTab = dressesTab;
	}
	
	

}
