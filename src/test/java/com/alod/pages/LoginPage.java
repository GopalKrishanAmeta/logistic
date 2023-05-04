package com.alod.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	

	@FindBy(name="user_name")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="login-business-btn-id")
	@CacheLookup
	WebElement submit;
	
	public void enterEmail() {
		
		email.sendKeys("772777277727");
		
	}
	
    public void enterPassword() {
		
    	password.sendKeys("123456");
		
	}
    
    public void clickOnSubmit() {
		
    	submit.click();
		
	}
    
    
	
	
}
