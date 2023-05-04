package com.alod.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
 
 

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
@BeforeTest

public void setUPMethod()
{
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	
    driver.manage().window().maximize(); 
    driver.manage().deleteAllCookies();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
   
}

//@AfterSuite  

public void quitDriver() {  
          driver.quit();  
} 


}
