package PGObjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonSellProductPage {
	
	WebDriver driver;
	
			public AmazonSellProductPage(WebDriver driver) {
				this.driver=driver;
			}
			
			@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]") WebElement Searchbtn;
			
			@FindBy(xpath ="//*[@id=\"nav-search-submit-button\"]") WebElement clickonsearchbtn;
			
			@FindBy(xpath ="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span") WebElement clickonproduct;
			
			@FindBy(xpath ="//*[@id=\"add-to-cart-button\"]") WebElement clickonaddcart;
			
			
			public void setentercomputermouse(String purchasemouse) {
				
				Searchbtn.sendKeys(purchasemouse);
			}
			
			public void clicksubmitbtn()
			{
				clickonsearchbtn.click();
				
			}
		
			public void clickonproduct()
			{
				clickonproduct.click();
				
			}
			
			public void Clickoncartbtn( )
			{
				clickonaddcart.click();
				
			}
}
