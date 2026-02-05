package org.automation.ModulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ShoppingCardPage {
	// declaration
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@name='removeFromCart']") 
	private WebElement SmartPhoneCartItem;
	@FindBy(xpath = "//input[@name='updatecart']") private WebElement updateCartButton;
	@FindBy(xpath = "//input[@name='continueshopping']']") private WebElement continueShoppingButton;
	@FindBy(id = "termsofservice") private WebElement termsOfServiceCheckBox;
	@FindBy(xpath = "//button[@name='checkout']']']") private WebElement checkoutButton;
	@FindBy(xpath = "//input[@name='termsofservice']") private WebElement agreeCheckBox;
	
	// initialition
	public ShoppingCardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// utilization
	public WebElement getSmartPhoneItom() {
		return SmartPhoneCartItem;
	}
	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}
	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}
	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	public WebElement getAgreeCheckBox() {
		return agreeCheckBox;
	}
	
	// Oprational method / Buisnes login
	public void RemoveProducatMethod() throws InterruptedException {
		SmartPhoneCartItem.click();
		Thread.sleep(500);
		updateCartButton.click();
	}

	public WebElement getTermsandconditionscheckbox() {
		return termsOfServiceCheckBox;
	}
	
}
