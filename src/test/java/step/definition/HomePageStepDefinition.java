package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.object.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {
	
	HomePageObject homePageObject = new HomePageObject();
	//Scenario: User verify currency values change

	@When("User click on Currency")
public void user_click_on_currency() {
		homePageObject.ClickOnCurrency();
        logger.info("Currency clicked successfully");
}

@When("User Chose Euro from dropdown")
public void user_chose_euro_from_dropdown() {
	homePageObject.ClickOnHoveToEuro();
    logger.info("Euro choosed successfully");

}

@Then("currency value should change to Euro")
public void currency_value_should_change_to_euro() {
	String expectedText = "€";
    String actualText = homePageObject.ShowCurrencyValue();
    Assert.assertEquals(expectedText, actualText);
    logger.info("currency changed to Euro successfully");
    Utils.takeScreenShot();

}
//Scenario: User empty Shopping cart message displays 


@When("User click on shopping cart")
public void user_click_on_shopping_cart() {
	homePageObject.ClickOnShoppingCart();
    logger.info("Shopping cart clicked successfully");
}

@Then("{string} message should display")
public void message_should_display(String string) {
	String expectedText = "Your shopping cart is empty!";
    String actualText = homePageObject.getMessagedisplayed();
    Assert.assertEquals(expectedText, actualText);
    Utils.takeScreenShot();

}
}

