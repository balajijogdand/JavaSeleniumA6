package org.automation.ModulerFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase_RemoveProductFromCart_002 extends BaseTest {
	@Test
	public void RemoveProductFromCartMethod() throws InterruptedException {
		BasePage bp = new BasePage(driver);
		bp.getElectronics().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhones().click();
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddTocartButton().click();
		
		 SoftAssert sa = new SoftAssert();
		 
		 sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(),true,"Product is not added to cart");
		 
		 bp.getShoppingCards().click();
		 
		 ShoppingCardPage scp = new ShoppingCardPage(driver);
		 scp.RemoveProducatMethod();
		 
		 try {
		 sa.assertEquals(scp.getSmartPhoneItom().isDisplayed(), false, "Product is not remove from cart");
		 }
		 catch(Exception e){
			 sa.assertEquals(scp.getSmartPhoneItom().isDisplayed(), false, "Product is not remove from cart"); 
		 }
	   }
	}
