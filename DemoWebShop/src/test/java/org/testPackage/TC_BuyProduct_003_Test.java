package org.testPackage;
import org.genericLibrary.BaseTest;
import org.genericLibrary.Flib;
import org.pomRepositary.BasePage;
import org.pomRepositary.CellPhonesPage;
import org.pomRepositary.CheckOutPage;
import org.pomRepositary.ElectronicsPage;
import org.pomRepositary.ShoppingCardPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(org.genericLibrary.MyListener.class)

public class TC_BuyProduct_003_Test extends BaseTest{
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
		 
		String pinCode = Flib.getWorkbookCellValue(EXEL_PATH_MAIN,"DataSheet1", 1, 0);
		String city = Flib.getWorkbookCellValue(EXEL_PATH_MAIN,"DataSheet1", 1, 1);
		String mobile = Flib.getWorkbookCellValue(EXEL_PATH_MAIN,"DataSheet1", 1, 2);
		String email = Flib.getWorkbookCellValue(EXEL_PATH_MAIN,"DataSheet1", 1, 3);
		
		 CheckOutPage cpp1 = new CheckOutPage(driver);
		 cpp1.buyingSmartPhone(pinCode, city, mobile, email);
	}	
}