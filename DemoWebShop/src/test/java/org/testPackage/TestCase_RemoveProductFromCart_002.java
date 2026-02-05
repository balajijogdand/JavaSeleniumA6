package org.testPackage;

import java.util.NoSuchElementException;

import org.genericLibrary.BaseTest;
import org.pomRepositary.BasePage;
import org.pomRepositary.CellPhonesPage;
import org.pomRepositary.ElectronicsPage;
import org.pomRepositary.ShoppingCardPage;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(org.genericLibrary.MyListener.class)
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
		 sa.assertEquals(scp.getSmartPhoneItom().isDisplayed(), false);
		 }
		 catch(NoSuchElementException e){
			 Reporter.log("product remove from cart", true);
		 }
		 sa.assertAll();
	   }
	}
