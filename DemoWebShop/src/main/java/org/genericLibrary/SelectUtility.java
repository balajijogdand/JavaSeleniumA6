package org.genericLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {
	// to select and option by its visible text
	public void selectByVisibleTextMethod(WebElement dropDounElement, String visibleText) {
		Select sel = new Select(dropDounElement);
		sel.selectByVisibleText(visibleText);
	}
}
