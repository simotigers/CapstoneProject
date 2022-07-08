package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	public HomePageObject () {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button")
	private WebElement Currency;	
	
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/ul/li[1]/button")
	private WebElement HoveToEuro;
	
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement CurrencyValue;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[4]/a/i")
	private WebElement ShoppingCart;
	
	@FindBy(xpath = "//*[@id=\"content\"]/p")
	private WebElement Messagedisplayed;
	
	public void ClickOnCurrency() {
		Currency.click();
	}
	public void ClickOnHoveToEuro() {
		HoveToEuro.click();
	}
	public String ShowCurrencyValue() {
		String actualValue = CurrencyValue.getText();
		return actualValue;
	}
	public void ClickOnShoppingCart() {
		ShoppingCart.click();
	}
	public String getMessagedisplayed() {
		String actualMessage = Messagedisplayed.getText();
		return actualMessage;
}
}
	
