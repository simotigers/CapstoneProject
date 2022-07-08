package page.object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base{
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private WebElement LaptopAndNotes;
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private WebElement ShowWllLapTops;
	@FindBy(xpath="//a[text()='MacBook']")
	private WebElement MacBook;
	@FindBy(id="button-cart")
	private WebElement AddMacBook;
	@FindBy(css="#product-product > div.alert.alert-success.alert-dismissible > a:nth-child(1)")
	private WebElement MacSuccessMsg;
	@FindBy(xpath="//*[@id=\"cart-total\"]/text()")
	private List <WebElement> MacDisplayed;
	@FindBy(id="cart")
	private WebElement CartOption;
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button")
	private WebElement RemoveMac;
	@FindBy(xpath = "//*[text()=' 1 item(s) - $602.00']")
	private WebElement SeeOneItemInItemsOption;
	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement noItemsAddtothecart;
	@FindBy(css="#cart-total")
	private List <WebElement> EmptyCart;
	@FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
	private WebElement succesAddMacBookAirtoProductCompare;
	@FindBy(css="#content > div:nth-child(7) > div:nth-child(3) > div > div:nth-child(2) > div.button-group > button:nth-child(3)") 
    private WebElement MacComparison;
	@FindBy(css="#content > div:nth-child(7) > div:nth-child(2) > div > div:nth-child(2) > div.button-group > button:nth-child(3)")
	private WebElement MacAirComparison;
	@FindBy(css="#product-category > div.alert.alert-success.alert-dismissible > a:nth-child(2)")
	private WebElement MacAirSccess;
	@FindBy(css="#product-category > div.alert.alert-success.alert-dismissible > a:nth-child(3)")
	private WebElement ComparisonLink;
	@FindBy(css="#content > h1")
	private WebElement CmparisonChart;
//	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
//	private WebElement SonyValioWishList;
//	@FindBy(css="#product-category > div.alert.alert-success.alert-dismissible")
//	private WebElement SonyValioWishListMessage;
	@FindBy(xpath = "//div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement clickOnwishbutton;
	@FindBy(xpath = "//*[text()=' You must ']")
	private WebElement youMustLogin;
	@FindBy(css="#content > div:nth-child(7) > div:nth-child(4) > div > div:nth-child(2) > div.caption > h4 > a")
	private WebElement MacBookPro;
	@FindBy(css="#content > div > div.col-sm-4 > ul:nth-child(4) > li:nth-child(1) > h2")
	private WebElement MacProPrice;
	
	public void ClickOnLaptopAndNotes() {
		Utils.hoveMouseOverElement(LaptopAndNotes);
	}
	public void ClickOnShowWllLapTops() {
		ShowWllLapTops.click();
	}
	public void ClickOnMacBook() {
		MacBook.click();
	}
	public void ClickOnAddMacBook() {
		AddMacBook.click();
	}

	
	public String GetMacSuccessMsg() {
		String MacActualMsg ="Success: You have added "+MacSuccessMsg.getText()+" to your shopping cart!";
		return MacActualMsg;
	}
	public void GetMacDisplayed(Integer int1, Double double1) {
	
		List<WebElement> MacDisplayedElements = MacDisplayed;
		
		for(WebElement element:MacDisplayedElements) 
		{
			if(element.isDisplayed()) {
				element.getCssValue("value");
			}
				else if(element.isDisplayed()) {
					element.getCssValue("value");
				}
			break;
			}
		
		}
	
	public void ClickOnCartOption() {
		CartOption.click();
	}
	public void ClickOnRemoveMac() {
		RemoveMac.click();
	}
	public void ShowEmptyCart(Integer int1) {
		List<WebElement>EmptyCartElements = EmptyCart;
		for(WebElement element:EmptyCartElements) {
			if(element.isDisplayed()) {
				element.getAttribute("value");
				break;
			}
			
		}
	}
		public void SeeOneItemInItemsOption() {
			SeeOneItemInItemsOption.isDisplayed();
		}
		public void noItemsAddtothecart() {
			noItemsAddtothecart.isDisplayed();
		}
		
	
	public void ClickOnMacComparison() {
		MacComparison.click();
	}
	public void ClickOnMacAirComparison() {
		MacAirComparison.click();
	}
	public String GetMacAirSccess() {
		String ActualMacAirSccess = "Success: You have added "+MacAirSccess.getText()+" to your product comparison!";
		return ActualMacAirSccess;
	}
	public void succesAddMacBookAirtoProductCompare() {
		succesAddMacBookAirtoProductCompare.isDisplayed();
	}

	public void ClickOnComparisonLink() {
		ComparisonLink.click();
	}
	public void CmparisonChartDisplayed() {
		CmparisonChart.isDisplayed();
	}
//	public void ClickOnSonyValioWishList() {
//		SonyValioWishList.click();
//	}
//	public String GetSonyValioWishListMessage() {
//		String ActualSonyValioWishListMessage = SonyValioWishListMessage.getText();
//				return ActualSonyValioWishListMessage;
//	}
	public void clickOnwishbutton() {
		clickOnwishbutton.click();
	}

	public void youMustLogin() {
		youMustLogin.isDisplayed();
	}
	public void ClickOnMacBookPro() {
		MacBookPro.click();
	}
	public void ShowMacProPrice() {
		MacProPrice.isDisplayed();
	}
	
		
		
	}


