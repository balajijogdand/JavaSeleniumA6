package org.automation.ModulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	// declaration
	@FindBy(linkText = "Register") private WebElement registerLink;
	@FindBy(id = "gender-male") private WebElement MaleRedioButton;
	@FindBy(id = "gender-female") private WebElement femailRedioButton;
	@FindBy(id = "FirstName") private WebElement firstName;
	@FindBy(id = "LastName") private WebElement lastName;
	@FindBy(id = "Email") private WebElement email;
	@FindBy(id = "Password") private WebElement password;
	@FindBy(id = "ConfirmPassword") private WebElement conformPassword;
	@FindBy(id = "register-button") private WebElement registerButton;
	
	// initialization
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement GetMaleRedioButton() {
		return MaleRedioButton;
	}
	
	public WebElement getfemailRedioButton() {
		return femailRedioButton;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConformPassword() {
		return conformPassword;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
}
