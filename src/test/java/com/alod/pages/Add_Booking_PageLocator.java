package com.alod.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Add_Booking_PageLocator {
	WebDriver driver;
	
	public Add_Booking_PageLocator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
//Click on booking button 
	
	@FindBy(xpath="//*[@id=\"sidenav-collapse-main\"]/ul/li[2]/a")
	@CacheLookup
	WebElement Bookings;
	
	@FindBy(xpath="//*[@id=\"panel\"]/div[2]/div/div[1]/div/div[1]/div[1]/div/a[3]")
	@CacheLookup
	WebElement Add_Booking;
//Select pickup location 	
	@FindBy(id="pickup_location_0")
	@CacheLookup
	WebElement pickuplocation;
	
	@FindBy(xpath="//*[@id=\"address_map\"]/div/div/div[2]/div[2]/div/div[3]/div")
	@CacheLookup
	WebElement Sourcelocatorpickup;
	
	@FindBy(id="business_name")
	@CacheLookup
	WebElement pickuplocationName;
	
	@FindBy(id="done_button")
	@CacheLookup
	WebElement clickOnDone;
//Select drop of location 	
	
	@FindBy(id= "pac-input")
	@CacheLookup
	WebElement placeField;
	
	@FindBy(xpath="//*[@id=\"exampleModal\"]/div/div/div[2]/div/div[1]/ul/li[1]")
	@CacheLookup
	WebElement autosuggestionpickup;
	
	
	@FindBy(id="dropoff_0")
	@CacheLookup
	WebElement drop_off_address;
	
	@FindBy(xpath="//*[@id=\"address_map\"]/div/div/div[2]/div[2]/div/div[3]/div")
	@CacheLookup
	WebElement Sourcelocatordropoff;
	
 	
	@FindBy(id="done_button")
	@CacheLookup
	WebElement clickOnDonedropoff;
	
	
	@FindBy(id="booking_type_0")
	@CacheLookup
	WebElement booking_type;
	
	@FindBy(id="stakeholder_name_0")
	@CacheLookup
	WebElement customer_name;
	
	@FindBy(id="stakeholders_0")
	@CacheLookup
	WebElement customer_Mobile_Number;
	
	@FindBy(id="item_name_0")
	@CacheLookup
	WebElement Item_Name;
	
	@FindBy(id="item_quantity_0")
	@CacheLookup
	WebElement Item_Quantity;
	
	@FindBy(id="item_weight_value_0")
	@CacheLookup
	WebElement Item_Weight_KGS;
	
	@FindBy(id="item_images_0")
	@CacheLookup
	WebElement Item_Image;
	
	@FindBy(id="item_detail_0")
	@CacheLookup
	WebElement Item_Details;
	
	@FindBy(id="quantity_0")
	@CacheLookup
	WebElement Package_Quantity;
	
	@FindBy(id="item_price_0")
	@CacheLookup
	WebElement Goods_Value;
	
	//choose delivery paetner
	@FindBy(id="delivery_partners_jt_0")
	@CacheLookup
	WebElement Delivery_Partners_jt;
	
	@FindBy(id="delivery_partners_ups_0")
	@CacheLookup
	WebElement Delivery_Partners_ups;
	
	@FindBy(id="delivery_partners_dhl_0")
	@CacheLookup
	WebElement delivery_partners_dhl;
	
	 
	@FindBy(id="add-booking-btn-id")
	@CacheLookup
	WebElement submit;
	
	// payment checkout locators
	
	@FindBy(id="is_wallet")
	@CacheLookup
	WebElement wallet;
	
	@FindBy(id="online")
	@CacheLookup
	WebElement online;
	
	//card Details locators
	
	@FindBy(id="card-number")
	@CacheLookup
	WebElement cardNumber;
	
	@FindBy(id="expiration-date")
	@CacheLookup
	WebElement expirationdate;
	
	@FindBy(id="cvv")
	@CacheLookup
	WebElement cvv;
	
	@FindBy(id="card-holder")
	@CacheLookup
	WebElement card_holder;
	
	 
	@FindBy(xpath="//*[@id=\"gosell-gateway-btn\"]/div[1]")
	@CacheLookup
	WebElement pay_button;
	
	@FindBy(id="acssubmit")
	@CacheLookup
	WebElement authenication_click;
		
	@FindBy(id="payment-btn-id")
	@CacheLookup
	WebElement continue_button;
	
//	success booking
	
	@FindBy(xpath="/html/body/div[8]/div/div[3]/button[1]")
	@CacheLookup
	WebElement success_ok;
	
public void click_on_BookingTab() {
		
	Bookings.click();
		
	}

public void click_on_AddBooking() {
	
	Add_Booking.click();
		
	}

public void select_pickup_location() throws InterruptedException {
	
	Select dropdown_pickup = new Select(pickuplocation);
	dropdown_pickup.selectByIndex(1);
	
	driver.switchTo().activeElement();
	
	Actions action = new Actions(driver);
	action.moveToElement(Sourcelocatorpickup, 0, 0).clickAndHold().moveByOffset(300, 0).release().build().perform();
	
	pickuplocationName.sendKeys("Test Business");
	Thread.sleep(2000);
	clickOnDone.click();
	
	
}

public void select_Dropoff_location() throws InterruptedException {
	
	
	drop_off_address.click();
	
	Thread.sleep(1000);
	
	driver.switchTo().activeElement();
	Thread.sleep(1000);
	
	placeField.sendKeys("riyadh collage");
	autosuggestionpickup.click();
	
	Actions scroll= new Actions(driver);
	 
	scroll.moveToElement(Sourcelocatordropoff).clickAndHold().moveByOffset(300,0).release().build().perform();
	Thread.sleep(1000);
	clickOnDonedropoff.click();
 		
}

public void select_booking_type() {
	Select dropdown_booking = new Select(booking_type);
	dropdown_booking.selectByIndex(1);
	
	
}
  
public void customer_details() {
	customer_name.sendKeys("Test Customer");
	customer_Mobile_Number.sendKeys("91236547890");
	
}

public void item_details() {
	Item_Name.sendKeys("Test Item");
	Item_Quantity.sendKeys("10");
	Select dropdown_itemWeight = new Select(Item_Weight_KGS);
	dropdown_itemWeight.selectByIndex(2);
	
	Item_Image.sendKeys("D:/Krishan Gopal_Fullestop/Testing Data (Image, Audio, Video)/Test Image/same size image/benedikt_300_300.jpg");
	
	Item_Details.sendKeys("Test New item details");
	Package_Quantity.sendKeys("2");
	Goods_Value.sendKeys("2000");
}
public void choose_delivery_patner_jt()
{
	Delivery_Partners_jt.click();
	
	submit.click();
}
public void Delivery_Partners_ups()
{
	Delivery_Partners_ups.click();
	
	submit.click();
}

public void Delivery_Partners_dhl()
{
	delivery_partners_dhl.click();
	driver.findElement(By.id("length_0")).sendKeys("10");
	driver.findElement(By.id("width_0")).sendKeys("10");
	driver.findElement(By.id("height_0")).sendKeys("10");
	submit.click();
}



public void payment() throws InterruptedException {
	
	driver.switchTo().activeElement();
	
//	wallet.click();
	online.click();
	continue_button.click();
	Thread.sleep(4000);
 
	driver.switchTo().frame("gosell-gateway");
	driver.switchTo().frame("myFrame");
	
	
	cardNumber.sendKeys("5123450000000008");
	expirationdate.sendKeys("0139");
	cvv.sendKeys("123");
	card_holder.sendKeys("Test");
 
	 
 
	Thread.sleep(3000);
	
	driver.switchTo().activeElement();
	 driver.switchTo().parentFrame(); 
	 JavascriptExecutor j = (JavascriptExecutor) driver;
	 j.executeScript("arguments[0].click();", pay_button);
	 

	Thread.sleep(5000);
	driver.switchTo().frame("challengeFrame");
	authenication_click.click();
	
	Thread.sleep(15000);
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOf(success_ok));
	 success_ok.click();
}


}
