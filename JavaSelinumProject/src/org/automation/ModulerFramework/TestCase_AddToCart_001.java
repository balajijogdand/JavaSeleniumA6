package org.automation.ModulerFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase_AddToCart_001 extends BaseTest{
	@Test
	public void AddToCartmethod() {
		BasePage bp = new BasePage(driver);
		bp.getElectronics().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhones().click();
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddTocartButton().click();
		
		 SoftAssert sa = new SoftAssert();
		 
		 sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(),true,"Product is not added to cart");
	}
}
