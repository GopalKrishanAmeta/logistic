package com.alod.test;

import org.testng.annotations.Test;

import com.alod.pages.Add_Booking_PageLocator;
import com.alod.pages.LoginPage;

import org.testng.Assert;
 

public class TC_001 extends BaseClass {
	
	
	@Test(priority = 1)
	
	public void launchURL(){
		
		driver.get("https://alod.demoe2.com/login/business");
		
		String expectedTitle = "Alod";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		}
	
	@Test(priority = 2)
	public void businessLogin() {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterEmail();
		lp.enterPassword();
		lp.clickOnSubmit();
	}
	
	@Test(priority = 3)
	public void createBooking_Jt() throws InterruptedException {
		
		Add_Booking_PageLocator abp = new Add_Booking_PageLocator(driver);
		
		abp.click_on_BookingTab();
		abp.click_on_AddBooking();
		abp.select_pickup_location();
		abp.select_Dropoff_location();
		abp.select_booking_type();
		abp.customer_details();
		abp.item_details();
		abp.choose_delivery_patner_jt();
		abp.payment();
	}
	
	@Test(priority = 3)
	public void createBooking_UPS() throws InterruptedException {
		
		Add_Booking_PageLocator abp = new Add_Booking_PageLocator(driver);
		abp.click_on_BookingTab();
		abp.click_on_AddBooking();
		abp.select_pickup_location();
		abp.select_Dropoff_location();
		abp.select_booking_type();
		abp.customer_details();
		abp.item_details();
		abp.Delivery_Partners_ups();
		abp.payment();
	}
	
	@Test(priority = 4)
	public void createBooking_DHL() throws InterruptedException {
		
		Add_Booking_PageLocator abp = new Add_Booking_PageLocator(driver);
		abp.click_on_BookingTab();
		abp.click_on_AddBooking();
		abp.select_pickup_location();
		abp.select_Dropoff_location();
		abp.select_booking_type();
		abp.customer_details();
		abp.item_details();
		abp.Delivery_Partners_dhl();
		abp.payment();
	}
}
