package org.pomRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage {
	// declaration
	@FindBy(xpath = "//a[text()='Smartphone']/../../..//input[@value='Add to cart']") private WebElement cellPhoneAddTocartButton;
	@FindBy(xpath = "//p[contains(text(),'The product has been added to your ')]") private WebElement ProductAddedToCartMsg;
	 
	// initializetion
	public CellPhonesPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	// utilization
	public WebElement getCellPhoneAddTocartButton() {
		return cellPhoneAddTocartButton;
	}


	public WebElement getProductAddedToCartMsg() {
		return ProductAddedToCartMsg;
	}
}
