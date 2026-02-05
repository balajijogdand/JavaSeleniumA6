package org.pomRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	// declaration
	@FindBy(linkText = "Register") private WebElement registerLink;
	@FindBy(linkText = "Log in") private WebElement loginLink;
	@FindBy(xpath = "//span[text()='Shopping Card']") private WebElement shoppingCards;
	@FindBy(xpath = "//span[text()='Wishlist']") private WebElement widhlist;
	@FindBy(partialLinkText = "Books") private WebElement books;
	@FindBy(partialLinkText = "Computers") private WebElement computer;
	@FindBy(partialLinkText = "Electronics") private WebElement electronics;
	
	// initialization
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// utilization
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCards() {
		return shoppingCards;
	}

	public WebElement getWidhlist() {
		return widhlist;
	}

	public WebElement getBooks() {
		return books;
	}

	public WebElement getComputer() {
		return computer;
	}

	public WebElement getElectronics() {
		return electronics;
	}
	
}
