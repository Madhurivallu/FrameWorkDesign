package PGObjmodel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AmazonProductSellingTest extends AmazonProductTestBase {
	
	@Test
	public void init() throws Exception{
		
		AmazonSellProductPage AMZSELL = PageFactory.initElements(driver, AmazonSellProductPage.class);
		
		AMZSELL.setentercomputermouse("Computer mouse");
		
		AMZSELL.clicksubmitbtn();
		
		Thread.sleep(2000);
		
		AMZSELL.clickonproduct();
		
		Thread.sleep(2000);
		
		AMZSELL.Clickoncartbtn();
		
		
	}

}
