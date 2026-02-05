package org.testPackage;

import org.genericLibrary.BaseTest;

import org.pomRepositary.BasePage;
import org.pomRepositary.CellPhonesPage;
import org.pomRepositary.ElectronicsPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(org.genericLibrary.MyListener.class)
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
