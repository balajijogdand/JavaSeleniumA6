package org.automation.ModulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// declaration
		@FindBy(linkText = "Log in") private WebElement loginLink;
		@FindBy(id = "Email") private WebElement loginEmail;
		@FindBy(id = "Password") private WebElement loginPassword;
		@FindBy(className = "button-1 login-button") private WebElement loginButton;
		
		// initialization
	    public LoginPage(WebDriver driver) {
	    	    PageFactory.initElements(driver, this);
	    }
	
	    // utilization
		public WebElement getLoginLink() {
			return loginLink;
		}
		public WebElement getLoginEmail() {
			return loginEmail;
		}
		public WebElement getLoginPassword() {
			return loginPassword;
		}
		public WebElement getLoginButton() {
			return loginButton;
		}
		
}
