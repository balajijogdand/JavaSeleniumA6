package org.automation.ModulerFramework;

import org.automation.genericUtilities.Flib;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_BuyProduct_003_Test extends BaseTest{

	private static final int Contact = 0;

	@Test
	public void buyProductMethod() throws InterruptedException 
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronics().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhones().click();
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddTocartButton().click();
		
		 SoftAssert sa = new SoftAssert();
		 sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(), true, "Product is not added to cart");
		 Thread.sleep(3000);
		 
		 bp.getShoppingCards().click();
		 
		 ShoppingCardPage scp=new ShoppingCardPage(driver);
		 scp.getSmartPhoneItom().click();
		 scp.getTermsandconditionscheckbox().click();
		 scp.getCheckoutButton().click();
		 
		String pinCode = Flib.getWorkbookCellValue("DataSheet1", 1, 0);
		String city = Flib.getWorkbookCellValue("DataSheet1", 1, 1);
		String mobile = Flib.getWorkbookCellValue("DataSheet1", 1, 2);
		String email = Flib.getWorkbookCellValue("DataSheet1", 1, 3);
		
//		int rn = Flib.genarateRandomNumber();
//		int mobileNo = Contact+rn;
		 
		 System.out.println(pinCode);
		 System.out.println(city); 
		 System.out.println(mobile);
		 System.out.println(email);
	}
	
	
}