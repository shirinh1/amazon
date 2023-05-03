package tests;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;
import pageObjects.AmazonBabyProductPage;
import pageObjects.AmazonHomePage;

public class BabyProductTest extends BaseClass {
	
	public void validateBabyProduct() {
		
		GenericClassTest gc = new GenericClassTest();
		
		gc.DynamicallyHandlingDropDown(AmazonHomePage.AllDropDownXpath, "Baby");
		driver.findElement(By.xpath(AmazonHomePage.searchIconXpath)).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(AmazonBabyProductPage.babyProductXpath)).isDisplayed());
		
		}
		
}
