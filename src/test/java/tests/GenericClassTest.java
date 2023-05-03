package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.AmazonBabyProductPage;
import pageObjects.AmazonHomePage;

public class GenericClassTest extends BaseClass {

	@Test
	public void handlingDropDown() {
	
		Select s = new Select(driver.findElement(By.xpath(AmazonHomePage.AllDropDownXpath)));
		
		s.selectByVisibleText("Baby"); 
		
		//s.selectByIndex(2);
		
		driver.findElement(By.xpath(AmazonHomePage.searchIconXpath)).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(AmazonBabyProductPage.babyProductXpath)).isDisplayed());
			
		
	}
	
	public void DynamicallyHandlingDropDown(String xpath, String text) {
		
		Select s = new Select(driver.findElement(By.xpath(xpath)));
		
		s.selectByVisibleText(text); //mostly used
		
		//s.selectByIndex(0);
		//s.selectByValue(text);
		
		//driver.findElement(By.xpath(AmazonHomePage.searchIconXpath)).click();
		
		//Assert.assertTrue(driver.findElement(By.xpath(AmazonBabyProductPage.babyProductXpath)).isDisplayed());
		
		
}
}
