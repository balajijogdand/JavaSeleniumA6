package org.pomRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	// declaration
	@FindBy(partialLinkText = "Cell phones") private WebElement cellPhones;
	@FindBy(partialLinkText = "Camera, photo") private WebElement CameraPhoto;


	// initialization
	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// utilization
	public WebElement getCellPhones() {
		return cellPhones;
	}

	public WebElement getCameraPhoto() {
		return CameraPhoto;
	}
}
